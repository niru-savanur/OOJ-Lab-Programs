#include <stdio.h>
#include<math.h>
void main()
{
  int a,b,choice;
  printf("enter two nums:");
  scanf("%d%d",&a,&b);
  do
   {
    printf("\nmenu\n 1 for addition\n 2 for subtraction\n 3 for multiplication\n 4 for division\n ");
    printf("5 to find min\n 6 to find max\n 7 for evencheck\n 8 to get remainder\n 9 for squares \n 10 for a power b\n 11 to exit\n");
    scanf("%d",&choice);

    switch(choice)
    {

      case 1 : printf("%d+%d=%d",a,b,a+b); break;

      case 2 : printf("%d-%d=%d",a,b,a-b); break;

      case 3 : printf("%d*%d=%d",a,b,a*b); break;

      case 4 : printf("%d/%d=%d",a,b,a/b); break;

      case 5 : if(a<b){
                printf("%d",a);
               }
               else if(b<a){
                printf("%d",b);
               }
               else
                printf("Both are same");
      break;
      case 6 : if(a>b){
                printf("%d",a);
               }
               else if(b>a){
                printf("%d",b);
               }
               else
                printf("Both are same");
      break;
      case 7 : if(a%2==0)
                 printf("%d is even",a);
               else
                 printf("%d is odd",a);
               if(b%2==0)
                 printf("%d is even",b);
               else
                 printf("%d is odd",b);
      break;
      case 8 : printf("%d",a%b); break;

      case 9 : printf("%d \t %d",a*a,b*b); break;

      case 10: ; int p = pow(a, b);
                printf("%d",p);
      break;
      case 11 : printf("exit"); break;

      default : printf("enter integer in range 1 to 11\n");

    }

  }while(choice != 11);

  }
