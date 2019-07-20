#include<stdio.h>
#include<stdlib.h>
#include<time.h>

void main()
{
    int i,a,n,p,tries=0;
    srand(time(NULL));
    a=rand()%500;
    do
    {
        for(i=1;i<=11;i++)
        {
        printf("Guess a number between 1 to 500:\n");
        scanf("%d",&n);
        if(n>a)
        {
            printf("Your number is high.Guess again\n");
        }
        else if (n<a)
        {
            printf("Your number is low.Guess again\n");
        }
        else if (a==n)
        {
            tries = i;
            printf("\tBINGO\n You got in %d tries\n",i);
            if(tries <=2 && tries >= 1)
            {
                printf("Your score is 100\n");
            }
            else if(tries <=3 && tries >2)
            {
                printf("Your score is 75\n");
            }
            else if (tries <=5 && tries >3)
            {
                printf("Your score is 50\n");
            }
            else if (tries <=7 && tries >5)
            {
                printf("Your score is 25\n");
            }
            else if (tries <=10 && tries >7)
            {
                printf("Your score is 5\n");
            }
            break;
        }
        }
    printf("Do you want to play again:\n1.yes 2.no \n");
    scanf("%d",&p);
    }while(p == 1);

}
