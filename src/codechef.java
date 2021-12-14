/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        try {
            Scanner sc=new Scanner(System.in);
            int t=sc.nextInt();
            while(t-->0)
            {
                int n=sc.nextInt();
                String c=sc.nextLine();
                char s[]=c.toCharArray();


                char dp_r[]=new char[n+1];
                char dp_p[]=new char[n+1];
                char dp_s[]=new char[n+1];

                char ans[]=new char[n+1];
                ans[n]=s[n-1];
                dp_r[n]=match('R',s[n-1]);
                dp_p[n]=match('P',s[n-1]);
                dp_s[n]=match('S',s[n-1]);

                for(int i=n-1;i>=1;i++)
                {
                    char r_res=match('R',s[i-1]);
                    if(r_res=='R')
                        dp_r[i]=dp_r[i+1];
                    else if(r_res=='P')
                        dp_r[i]=dp_p[i+1];
                    else if(r_res=='S')
                        dp_r[i]=dp_s[i+1];


                    char p_res=match('P',s[i-1]);
                    if(p_res=='R')
                        dp_p[i]=dp_r[i+1];
                    else if(p_res=='P')
                        dp_p[i]=dp_p[i+1];
                    else if(p_res=='S')
                        dp_p[i]=dp_s[i+1];

                    char s_res=match('S',s[i-1]);
                    if(s_res=='R')
                        dp_s[i]=dp_r[i+1];
                    else if(s_res=='P')
                        dp_s[i]=dp_p[i+1];
                    else if(s_res=='S')
                        dp_s[i]=dp_s[i+1];

                    if(s[i-1]=='R')
                        ans[i]=dp_r[i+1];
                    else if(s[i-1]=='P')
                        ans[i]=dp_p[i+1];
                    else if(s[i-1]=='S')
                        ans[i]=dp_s[i+1];
                }

                for(int i=1;i<=n;i++)
                    System.out.print(ans[i]);
            }

        } catch(Exception e) {
            return;
        }
    }

    static char match(char a, char b)
    {
        if(a==b)
            return a;

        else if(a=='R' && b=='P' || a=='P' && b=='R')
            return 'P';
        else if(a=='R' && b=='S' || a=='S' && b=='R')
            return 'R';
        else if(a=='P' && b=='S' || a=='S' && b=='P')
            return 'S';

        else
            return 'Z';
    }
}
