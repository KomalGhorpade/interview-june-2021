package exam;

public class CountCombinations {

  public int getNumberOfWays(final int total, final int k) {
    //TODO write your code here to achieve the desired result as explained in Readme file for this problem.
    int ans = 0;
        for (int i = total - k; i <= total; i++) 
        {
     
            int ways = nCr(total, i);
    
            ans += (ways * countDerangements(total- i));
        }
        return ans;
  }
    
    
    
    
    static int nCr(int total, int k)
    {
        int ans = 1;
        if (r > total - r)
            r = total - r;
        for (int i = 0; i < r; i++) {
            ans *= (n - i);
            ans /= (i + 1);
        }
        return ans;
    }
     
    
    static int countDerangements(int total)
    {
        int der[] = new int[ total + 3];
     
        der[0] = 1;
        der[1] = 0;
        der[2] = 1;
     
        for (int i = 3; i <= total; i++)
            der[i] = (i - 1) * (der[i - 1]
                            + der[i - 2]);
        return der[total];
    }
     
    
    }
