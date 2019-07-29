#include<stdio.h>
int main()
{
  int n,arr[50],rem_count=0,i;
  scanf("%d",&n);
  while(n!=0)
  {
    arr[rem_count++]=n%8;
    n=n/8;
  }
  for(i=rem_count-1;i>=0;i--)
    printf("%d",arr[i]);
  return 0;
}