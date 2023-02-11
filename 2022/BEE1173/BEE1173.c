#include <stdio.h>
#include <stdlib.h>

int main() {
    int v[10], n, i;

    scanf("%d", &n);
    fflush(stdin);

    for (i = 0; i < 10; i++) {
        v[i] = n;
        n += n;
        printf("N[%d] = %d\n", i, v[i]);
    }

    return 0;
}
