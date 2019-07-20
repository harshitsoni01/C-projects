 #include<stdio.h>
int main()
{
	int i,arr[5],temp;
	for(i=0;i<=4;i++)
	{
		printf("Enter the number %d:\n",i+1);
		scanf("%d",&arr[i]);
	}
	printf("The numbers are:\n");
	for(i=0;i<=4;i++)
	{
		printf(" %d\t",arr[i]);
	}
	for(i=0;i<=4;i++)
	{
		if(arr[i]>temp)
		{
			temp=arr[i];
		}
	}
	printf("\n\n\t\tHighest number =%d\n",temp);
}

