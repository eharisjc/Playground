#include<stdio.h>

int main()
{
  char str[100];
  scanf("%[^\n]s",str);
  int i,word;
  for(i=0;str[i]!='\0';i++)
  {
    if(str[i]==' ')
    {
      word++;
    }
  }
  word++;
  printf("%d",word);
}  
  
