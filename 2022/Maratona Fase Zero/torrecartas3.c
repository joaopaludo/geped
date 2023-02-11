#include <stdio.h>
#include <stdlib.h>

int main() {
    unsigned long long int cartasAt, j;
    int casos, i;
    scanf("%d", &casos);

    for (i = 0; i < casos; i++) {
        scanf("%lld", &cartasAt);

        for (j = 1; cartasAt >= (j * 2 + j - 1); j++) {
            cartasAt -= (j * 2 + j - 1);
        }

        printf("%lld\n", j - 1);
    }
}