#include<stdio.h>
void main(){
    int a, b, num1, num2, i, j;
    printf("Enter two nos:\n");
    scanf("%d%d",&num1,&num2);
    if(num1>num2){
        a = num2;
        b = num1;
    }
    else{
        a = num1;
        b = num2;
    }
    if(b < 2){
        printf("there are no prime nos in this range.\n");
        exit(0);
    }
    printf("prime nos in the range are:\n");
    for (i = a; i <= b; i++){
        int flag = 0;
        for(j = 2; j <= i/2; j++){
            if (i % j == 0){
                flag = 1;
                break;
            }
        }
        if (flag == 0 && i != 1 && i != 0){
        printf("%d",i);
        printf("\n");
        }
        }
}