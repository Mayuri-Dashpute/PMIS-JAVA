
class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int originalColor = image[sr][sc];

        if (originalColor == color) {
            return image;
        }

        dfs(image, sr, sc, originalColor, color);

        return image;
    }

    public void dfs(int[][] image, int sr, int sc,
                    int originalColor, int color) {

        // Check boundaries
        if (sr < 0 || sc < 0 ||
            sr >= image.length ||
            sc >= image[0].length) {
            return;
        }

        // Stop if the pixel has a different color
        if (image[sr][sc] != originalColor) {
            return;
        }

        // Change the pixel color
        image[sr][sc] = color;

        // Visit four adjacent pixels
        dfs(image, sr - 1, sc, originalColor, color); // Up
        dfs(image, sr + 1, sc, originalColor, color); // Down
        dfs(image, sr, sc - 1, originalColor, color); // Left
        dfs(image, sr, sc + 1, originalColor, color); // Right
    }
}
