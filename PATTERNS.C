#include<stdio.h>
#include<conio.h>
void main()
{
int i,j,n;
clrscr();
printf("Enter the number of rows:\n");
scanf("%d",&n);
i=1;
while(i<=n)
{
  j=n;
  while(j>=i)
  {
  printf(" ");
  j--;
  }
  j=1;
  while(j<=i)
  {
  printf("*");
  j++;
  }
  j=2;
  while(j<=i)
  {
  printf("*");
  j++;
  }
  printf("\n");
  i++;
}
getch();
}