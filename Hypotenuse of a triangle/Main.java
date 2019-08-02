#include<stdio.h>
#include<math.h>
int main()
{
  float p,b,h;
  scanf("%f",&p);
  scanf("%f",&b);
  h=sqrt(pow(p,2)+pow(b,2));
  printf("%.2f",h);
  return 0;
}