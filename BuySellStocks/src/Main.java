//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] prices = new int[]{7,1,5,3,6,4};

        Solution s = new Solution();

        int profit = s.BuySellStocks(prices);
        System.out.println(profit);
    }
}