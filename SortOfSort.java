public class SortOfSort{
    public static void sortOfSort(int x[]){
        for(int i=0;i<x.length;i++){
            for(int k=0;k<x.length;k++)
                if(x[i]>x[k])
                {
                    int temp = x[i];
                    x[i] = x[k];
                    x[k] = temp;
                }
        }
        int y[] = new int[x.length];
        System.arraycopy(x,0,y,0,x.length);
        int z[] = {3,4,7,8,6,5,2,1};
        for(int i=0;i<x.length;i++){
            x[i] = y[z [i] - 1];
        }
        for(int i = 0; i < x.length; i++){
            System.out.print(x[i]+" ");
        }

    }

}


