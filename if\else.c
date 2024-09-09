#include<stdio.h>
int main()
{
    int num;
    printf("Enter the number:");
    scanf("%d",&num);
    if(num>=18){
        printf("Eligible for vote");
    }
    else
    {
        printf("Not eligible for vote");
    }
    
}
