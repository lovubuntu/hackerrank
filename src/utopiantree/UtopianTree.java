package utopiantree;

/**
 * Created with IntelliJ IDEA.
 * User: prince
 * Date: 21/11/13
 * Time: 10:48 PM
 * To change this template use File | Settings | File Templates.
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
        if (isSummer(seasonNo)){
            height++;
        }
    }

    private boolean isSummer(int seasonNo){
        return (seasonNo % 2) == 0;
    }

    private boolean isMonsoon(int seasonNo){
        return (seasonNo % 2 == 1);
    }
}
