#include <math.h>
#include <stdio.h>
#include <stdlib.h>

int main() {
    int n, l, d, cafee, cont = 0;
    // float cafe;

    scanf("%d%d%d", &n, &l, &d);

    cafee = n * d;
    // cafe = (float)n * d / 1000;

    if (cafee > (l * 1000)) {
        printf("%d\n", cafee / l * 1000 + 1);
    } else {
        printf("%d\n", cafee);
    }

    return 0;
}