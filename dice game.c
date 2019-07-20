#include<stdio.h>
#include<stdlib.h>
#include<time.h>
void main()
{
    int i,Y,N,ans,s;
    srand(time(NULL));
    int r=(rand()%(6))+1;
    printf("\t WELCOME TO THE DICEROLL GAME\n");

    printf("The number on the dice is '%d'\n",r);
    printf("Do you want to continue:\n 1.yes 2.no\n");
    scanf("%d",&ans);
    while(ans==1)
    {
        srand(time(NULL));
        s=(rand()%(5))+2;
        printf("The number on the dice is '%d'\n",s);
        printf("Do you want continue:\n 1.yes 2.no\n");
        scanf("%d",&ans);
    }
    while(ans==2)
    {
        printf("\t\tCome again next time\n");
        break;
    }
}
