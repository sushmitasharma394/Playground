#include<stdio.h>
#include<math.h>
#define PI 3.14
int main()
{
float a,r,c;
  scanf("%f\n",&r);
  scanf("%f",&c);
a = (2 * PI * r )* (c/360);
printf("%.2f", a);
return(0);
}