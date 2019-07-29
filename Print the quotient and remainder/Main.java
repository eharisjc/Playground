#include<stdio.h>
int main()
{
  int N,n,quotient,remainder;
  N=365,n=4;
  quotient=N/n;
  remainder=N%n;
  printf("Quotient: %d\n",quotient);
  printf("Remainder: %d",remainder);
  return 0;
}