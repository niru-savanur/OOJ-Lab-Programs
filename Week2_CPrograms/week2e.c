#include <stdio.h>
struct course
{
char name[20];
} s[4][100];
void main()
{
 
int n,i,j,c[4]={0,0,0,0},choice;
char cn[4][10]={"IOT","JAVA","J2EE","DS"};
printf("Enter number of students:\n");
scanf("%d",&n);
printf("Enter student detals:\n");
for(i=0;i<n;i++)
{
printf("------------------------\n");
printf("Press code to select course:\n1 ) IOT\n2 ) ADVANCED JAVA\n3 ) J2EE\n4 ) DATA STRUCTURES\n");
scanf("%d",&choice);
if(choice<0||choice>4)
{
printf("INVALID CHOICE!");
continue;
}
printf("Enter name of student %d:\n",i+1);
scanf("%s",&s[choice-1][c[choice-1]].name);
c[choice-1]++;
}

disp:
for(i=0;i<4;i++)
{ if(c[i]>=0)
{
printf("LIST OF STUDENTS OF COURSE %s :\n",cn[i]);
for(j=0;j<c[i];j++)
{
printf("%d) %s \n",j+1,s[i][j]);
}
}
}
for(i=0;i<4;i++)
{ if(i==0){
    if (((c[0] > 4) || (c[0] == -1)) && ((c[1] > 4) || (c[1] == -1)) && ((c[2] > 4) || (c[2] == -1)) && ((c[3] > 4) || (c[3] == -1)))
    {
        exit(0);
    }
}
if(c[i]<4&&c[i]!=-1)
{
printf("Number of people less than 4 in course %s,please change the course:\n",cn[i]);
for(j=0;j<c[i];j++)
{
printf("Enter course code:\n");
scanf("%d",&choice);
if(choice==i+1){
printf("ENTER OTHER course!\n");
continue;
}
printf("Enter name:\n");
scanf("%s",&s[choice-1][c[choice-1]].name);
c[choice-1]++;
}
n=c[i];
c[i]=-1;
}
}

goto disp;
}