// Last updated: 2/26/2026, 9:56:09 AM
class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int n = image.length;
        int[][] result = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                result[i][j] = image[i][n - 1 - j];
            }
            for (int j = 0; j < n; j++) {
                if (result[i][j] == 0) {
                    result[i][j] = 1;
                }
                else {
                    result[i][j] = 0;
                }
            }
        }
        return result;
    }
}