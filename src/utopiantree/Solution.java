package utopiantree;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: prince
 * Date: 21/11/13
 * Time: 10:49 PM
 * To change this template use File | Settings | File Templates.
 */
public class Solution {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int testCaseCount = in.nextInt();
        UtopianTree utopianTree = new UtopianTree();
        for (int i=0;i<testCaseCount;i++){
             System.out.println(utopianTree.calculateHeight(in.nextInt()));
        }
    }
}
