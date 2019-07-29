#include<stdio.h>
int main()
{
  int a,n1,n2,n3;
  scanf("%d",&a);
  n1=a/10;
  n2=a%10;
  n3=n1+n2;
  printf("%d",n3);
  return 0;
}