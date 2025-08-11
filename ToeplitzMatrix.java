class Solution {
    public boolean isToeplitzMatrix(int[][] a) {
        int r=a.length,c=a[0].length;  
        
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if( i==0 || j==0){
                    int t1=i,t2=j;
                    int temp=a[i][j];
                    while(i<r && j<c){
                        if(a[i][j]!=temp){
                            return false;
                        }
                        i++;j++;    
                    }
                    i=t1;j=t2;                  
                }
                
            }
        }
        return true;
    }
}
