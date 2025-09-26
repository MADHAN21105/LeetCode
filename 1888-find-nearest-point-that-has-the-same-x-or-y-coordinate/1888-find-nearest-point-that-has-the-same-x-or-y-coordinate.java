class Solution {
    public int nearestValidPoint(int x, int y, int[][] points) {
        int minDistance = Integer.MAX_VALUE;
        int answer = -1;
        for (int i = 0; i < points.length; i++) {
            int ai = points[i][0];
            int bi = points[i][1];
            if (ai == x || bi == y) {
                int distance = Math.abs(x - ai) + Math.abs(y - bi);
                if (distance < minDistance) {
                    minDistance = distance;
                    answer = i; 
                }
            }
        }
       return answer ; 
    }
    }
