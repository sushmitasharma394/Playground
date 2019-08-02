#include<stdio.h>
#include<string.h>
int main()
{
  char a[1000];
  int l;
  gets(a);
  l=strlen(a);
  printf("%d",l);
  
  return 0;
}