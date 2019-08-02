#include<stdio.h>
int main()
{
long n;
 int i;
  long fact=1;
  scanf("%ld",&n);
  for(i=1;i<=n;i++)
  {
    fact=fact*i;
  }
  if(n=0)
  {
    printf("1");
  }
  else
  {
      printf("%ld",fact);
  }
}