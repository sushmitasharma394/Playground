#include <stdio.h>
// Main function
int main()
{
int a,b,gcd,i;
  scanf("%d\n%d",&a,&b);
  for(i=1;i<=a && i<=b;++i)
  {
    if(a%i==0 && b%i==0)
    {
      gcd=i;
    }
  }
      printf("%d",gcd);
  
  
   return 0;
}