package utopiantree;

/**
 * Author: lovubuntu
 * Date: 21/11/13
 */
public class UtopianTree {
    private int height;
    public int calculateHeight(int seasonCount) {
        height = 1;
        for (int seasonNo = 1;seasonNo <= seasonCount;seasonNo++) {
            calculateHeightForSeason(seasonNo);
        }
        return height;  //To change body of created methods use File | Settings | File Templates.
    }

    private void calculateHeightForSeason(int seasonNo) {
        if (isMonsoon(seasonNo)){
            height *= 2;
            return;
        }
        height++;
    }

    private boolean isMonsoon(int seasonNo){
        return (seasonNo % 2 == 1);
    }
}
