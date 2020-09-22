#include <stdio.h>
#include <stdlib.h>
#include <math.h>
#define pi 3.14
int main()
{
    int choice, r, h;
    float area, volume;
    printf("Enter shape you want\n");
    do
    {
        printf("\nmenu\n 1:Cylider\n 2:Cone\n 3:Sphere\n 4:Exit\n");
        scanf("%d", &choice);
        switch (choice)
        {
        case 1:
            printf("Enter radius:\n");
            scanf("%d", &r);
            printf("Enter height:\n");
            scanf("%d", &h);
            area = (2 * pi * r * h) + (2 * pi * pow(r, 2));
            volume = pi * pow(r, 2) * h;
            printf("Area:%f \t\t Volume:%f", area, volume);
            break;
        case 2:
            printf("Enter radius:\n");
            scanf("%d", &r);
            printf("Enter height:\n");
            scanf("%d", &h);
            area = pi * r * (r + sqrt(pow(h, 2) + pow(r, 2)));
            volume = pi * pow(r, 2) * h / 3.0;
            printf("Area:%f \t\t Volume:%f", area, volume);
            break;
        case 3:
            printf("Enter radius:\n");
            scanf("%d", &r);
            area = 4 * pi * pow(r, 2);
            volume = (4 / 3.0) * (pi * pow(r, 3));
            printf("Area:%f \t\t Volume:%f", area, volume);
            break;
        case 4:
            printf("Exit\n");
            break;
        default:
            printf("Enter a no. ranging from 1 to 4");
        }
    } while (choice != 4);
    return 0;
}