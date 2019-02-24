/*

public class Solution {
    public ArrayList<Integer> prevSmaller(ArrayList<Integer> A) {
        int len = A.size();
        if (len==0)
        {
            return -1;
        }

        int i=0, j=0;
        ArrayList G = new ArrayList();

        // i=0
        if(i=0){G[0]=-1;}

        for(i=1;i<len;i++)
        { for(j=i-1;j!=0;j--)
        {
            if(A[j]<A[i])
            {
                G[i]=A[j];
                break;
            }
            else
            {
                G[i]=-1;
            }
        }

        }

        return G;

    }


*/
