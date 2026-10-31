
class Solution {
    public int countIslands(int[][] grid, int k) {

        int m = grid.length;
        int n = grid[0].length;

        int count = 0;

        int[][] dirs = {
            {-1, 0},
            {1, 0},
            {0, -1},
            {0, 1}
        };

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                if (grid[i][j] == 0) continue;

                long sum = 0;

                Deque<int[]> st = new ArrayDeque<>();

                st.push(new int[]{i, j});

                sum += grid[i][j];
                grid[i][j] = 0; // visited

                while (!st.isEmpty()) {

                    int[] curr = st.pop();

                    int r = curr[0];
                    int c = curr[1];

                    for (int[] d : dirs) {

                        int nr = r + d[0];
                        int nc = c + d[1];

                        if (nr >= 0 && nr < m &&
                            nc >= 0 && nc < n &&
                            grid[nr][nc] > 0) {

                            sum += grid[nr][nc];

                            grid[nr][nc] = 0;

                            st.push(new int[]{nr, nc});
                        }
                    }
                }

                if (sum % k == 0) {
                    count++;
                }
            }
        }

        return count;
    }
}
