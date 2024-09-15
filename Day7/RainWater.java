package Day7;
public class RainWater {
    public int trap(int[] height) {
        int result = 0;
        int n = height.length;
        int preMax[] = new int[n];
        int sufMax[] = new int[n];
        
        preMax[0] = height[0];
        for(int i=1;i<n;i++){
            preMax[i] = Math.max(preMax[i-1],height[i]);
        }
        
        sufMax[n-1] = height[n-1];
        for(int i=n-2;i >= 0;i--){
            sufMax[i] = Math.max(sufMax[i+1],height[i]);
        }

        for(int i=1;i<n-1;i++){
            result += Math.min(preMax[i],sufMax[i])-height[i];
        }
        return result;
    }
}
