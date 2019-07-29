#include<stdio.h>
int main()
{
	int n,a,d,ev,od,t;
    scanf("%d",&n);
    if(n%2==0)
    {
      a=0,d=1;
      t=n/2;
      ev=a+(t-1)*d;
      printf("%d",ev);
    }
   else 
   {
     a=0,d=2;
     t=(n+1)/2;
     od=a+(t-1)*d;
     printf("%d",od);
   }
}