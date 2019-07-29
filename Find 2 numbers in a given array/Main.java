#include<stdio.h>
int main()
{
  	int n,i,elem_1,elem_2,elem_index1=-1,elem_index2=-1;
    scanf("%d",&n);
    int a[n];
    for(i=0;i<n;i++)
    {
      scanf("%d",&a[i]);
    }
    scanf("%d %d",&elem_1,&elem_2);
    for(i=0;i<n;i++)
    {
      if((elem_1==a[i]) && (elem_index1==-1))
      {
        elem_index1=i;
      }
      if((elem_2==a[i]) && (elem_index2==-1))
      {
        elem_index2=i;
      }
    }
  printf("Element 1 index = %d\n",elem_index1);
  printf("Element 2 index = %d",elem_index2);
}
       