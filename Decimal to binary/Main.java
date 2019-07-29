#include<stdio.h>
int main()
{
  int n,rem_count=0,i,arr[90];
  scanf("%d",&n);
  while(n!=0)
  {
    arr[rem_count++]=n%2;
    n=n/2;
  }
  for(i=rem_count-1;i>=0;i--)
  {
    printf("%d",arr[i]);
  }        
  return 0;
}