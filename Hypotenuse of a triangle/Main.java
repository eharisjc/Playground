#include<stdio.h>
int main()
{
  float opp,adj,hyp;
  scanf("%f %f",&opp,&adj);
  hyp=sqrt((opp*opp)+(adj*adj));
  printf("%.2f",hyp);
  return 0;
}