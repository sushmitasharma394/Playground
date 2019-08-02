#include<stdio.h>
int main()
{
  int a,b,c;
  scanf("%d",&a);
  scanf("%d",&b);
  scanf("%d",&c);
  if((a>b) && (a>c))
  {
   if(b>c)
   {
     printf("%d",b);
   }
    else 
    {
      printf("%d",c);
    }
  }
  if((b>a) && (b>c))
  {
    if(c>a)
    {
      printf("%d",c);
    }
     else
    {
      printf("%d",a);
    }
  }
  if((c>a) && (c>b))
  {
    if(a>b)
    {
      printf("%d",a);
    }
  else
  {
    printf("%d",b);
  }
  } 
}