#include <stdio.h>
int main()
{
    int a, b, sum = 0;
    printf("Enter the numbers:\n");
    scanf("%d", &a);
    scanf("%d", &b);
    sum = a + b;
    printf("sum=%d", sum);
    return 0;
}