class Solution {

    public int findCircleNum(int[][] isConnected) {

        int n = isConnected.length;

        boolean[] visited = new boolean[n];

        int provinces = 0;

        for (int i = 0; i < n; i++) {

            if (!visited[i]) {

                provinces++;

                dfs(i, isConnected, visited);
            }
        }

        return provinces;
    }

    static void dfs(int node, int[][] isConnected, boolean[] visited) {

        visited[node] = true;

        for (int neighbour = 0; neighbour < isConnected.length; neighbour++) {

            if (isConnected[node][neighbour] == 1 &&
                !visited[neighbour]) {

                dfs(neighbour, isConnected, visited);
            }
        }
    }
}