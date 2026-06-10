class Solution {
public int minSpeedOnTime(int[] dist, double hour) {
    int low=1;
    int high=10000000;
    int ans=-1;
    while(low<=high){
    int mid=low+(high-low)/2;
    double time=0;
    for(int i=0; i<dist.length-1; i++){
        time+= Math.ceil((double)dist[i]/mid);
    }
        time+=(double)dist[dist.length-1]/mid;
        if(time<=hour){
            ans=mid;
            high=mid-1;
        }
        else{
            low=mid+1;
        }
    }
    return ans;
}
}