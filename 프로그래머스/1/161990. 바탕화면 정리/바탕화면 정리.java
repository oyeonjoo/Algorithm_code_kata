class Solution {
    public int[] solution(String[] wallpaper) {
        int minX = wallpaper.length, 
            minY = wallpaper[0].length(), 
            maxX = 0, maxY = 0;

        for (int i = 0; i < wallpaper.length; i++) {
            for (int j = 0; j < wallpaper[i].length(); j++) {
                if (wallpaper[i].charAt(j) == '#') {
                    minX = Math.min(i, minX);
                    minY = Math.min(j, minY);
                    maxX = Math.max(i, maxX);
                    maxY = Math.max(j, maxY);
                }
            }
        }
        return new int[] {minX, minY, maxX + 1, maxY + 1};
    }
}