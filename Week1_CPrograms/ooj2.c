#include<stdio.h>

float sumaver (float n1, float n2);

void printeven (float n1, float n2);


int main(){
    float a, b, c, num1, num2, average;
    printf("Input three numbers\n");
    scanf("%f%f%f",&a,&b,&c);
    if (a < b && a < c){
        num1 = b;
        num2 = c;
    }
    if (b < a && b < c){
        num1 = a;
        num2 = c;
    }
    if (c < a && c < b){
        num1 = a;
        num2 = b;
    }
    average = sumaver(num1, num2);
    printf("\n average = %.2f\n", average);

    printeven(num1, num2);

    return 0;
}

float sumaver(float n1, float n2){
    printf("sum = %.2f", n1 + n2);
    return ((n1 + n2)/2);
}

void printeven (float n1, float n2){
    float a1, a2;
    if (n1 < n2){
        a1 = n1;
        a2 = n2;
    }
    else {
        a1 = n2;
        a2 = n1;
    }
    printf("even numbers between them are:\n");
    for (float i = a1 + 1; i < a2; i++){
        if ((int)i % 2 == 0){
            printf("%d\n", (int)i);
        }
    }
}


