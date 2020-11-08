#include<stdio.h>
#define SUB 6
void main(){
    float cieMark[SUB], seeMark[SUB], cie, see, totMark[SUB];
    int i,j,k;
    printf("Enter cie marks out of 50:\n");
    for ( i = 0; i<SUB; i++){
        printf("sub%d:",i+1);
        scanf("%f",&cie);
        if (cie > 50){
            printf("enter marks for 50\n");
            i-=1;
        }
        cieMark[i] = round(cie);
    }
    printf("Enter see marks out of 100:\n");
    for( j = 0; j< SUB; j++){
        printf("sub%d:", j + 1);
        scanf("%f", &see);
        if (see > 100){
            printf("enter marks for 100\n");
            i -= 1;
        }
        else {
            seeMark[j] = round(see/2);
        }
    }
    for (k = 0; k < SUB; k++){
        totMark[k] = cieMark[k] + seeMark[k];
        printf("for subject %d grade is:\n",k+1);
        if(totMark[k] >= 90){
            printf("S\n");
        }
        else if (totMark[k] >= 80){
            printf("A\n");
        }
        else if(totMark[k] >= 70){
            printf("B\n");
        }
        else if(totMark[k] >= 60){
            printf("C\n");
        }
        else if(totMark[k] >= 50){
            printf("D\n");
        }
        else if(totMark[k] >= 40){
            printf("E\n");
        }
        else {
            printf("F\n");
        }
        
    }

}