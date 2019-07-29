#include<stdio.h>
int main()
{
  int a,n1,n2,num;
  scanf("%d",&a);
  n1=a/100;
  n2=a%10;
  num=n1+n2;
  printf("%d",num);
  return 0;
}