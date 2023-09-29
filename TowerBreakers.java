public class TowerBreakers {
    public static int towerBreakers(int n, int m) {
        int winner = 0;

        int[] towers = new int[n];
        for (int i=0; i<n; i++) {
            towers[i] = m;
        }

        while (winner == 0) {

        }

        return winner;
    }

    public static void main(String[] args) {
        System.out.println(towerBreakers(2, 2));
    }
}