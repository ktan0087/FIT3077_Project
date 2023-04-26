package Backend;

import java.util.List;

public class Player {

    private String name;
    private TokenColour tokenColour;
    private int tokensOnBoard;
    private int tokensInHand;
    private boolean canFly;

    private ActionList allowableActions = new ActionList();

    public Player(String name, TokenColour tokenColour) {
        this.name = name;
        this.tokenColour = tokenColour;
        this.tokensInHand = Game.MAX_TOKENS_PLAYER;
        this.tokensOnBoard = Game.MAX_TOKENS_PLAYER-getTokensInHand();
        this.addAllowableAction(AllActions.PLACE_TOKEN);
        this.canFly = false;
    }

    public void playTurn(){
        // Handle player allowable actions in every turn
        if (getTokensInHand() <= 0){
            this.removeAllowableAction(AllActions.PLACE_TOKEN);
            this.addAllowableAction(AllActions.MOVE_TOKEN);
        }
        if (canPlayerFly()){
            this.addAllowableAction(AllActions.CAN_FLY);
        }
    }

    public String getName() {
        return name;
    }

    public int getTokensOnBoard() {
        return tokensOnBoard;
    }

    public TokenColour getTokenColour() {
        return tokenColour;
    }

    public int getTokensInHand() {
        return tokensInHand;
    }

    public boolean canPlayerFly() {
        return canFly;
    }

    //This function is used when a player's token is placed on the board.
    public void placeTokenOnBoard() {
        if (tokensInHand > 0) {
            tokensInHand--;
            tokensOnBoard++;
        }
    }

    // This function is used when a player's token is removed by another player
    public void loseTokenOnBoard() {
        if (tokensOnBoard > 0) {
            tokensOnBoard--;
            if (tokensOnBoard == 3 && getTokensInHand()==0) {
                canFly = true;
            }
        }
    }



    public boolean isActionAllowed(AllActions actions){
        return allowableActions.allowedActions(actions);
    }

    public void addAllowableAction(AllActions action) {
        allowableActions.addAction(action);
    }

    public void removeAllowableAction(AllActions action) {
        allowableActions.removeAction(action);
    }

    public List<AllActions> getAllowableActions() {
        return allowableActions.actionList();
    }

}
