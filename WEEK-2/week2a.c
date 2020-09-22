#include<stdio.h>
void main(){
    int n;
    printf("enter an integer:\n");
    scanf("%d",&n);
    int num = 1;
    for (int i = 0; i < n; i++)
    {
        for (int j = 0; j <= i; j++)
        {
            printf("%d\t",num);
            ++num;
        }
        printf("\n");
    }
}