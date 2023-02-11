#include <math.h>
#include <stdio.h>
#include <stdlib.h>

int main() {
    unsigned long long int cartasAt, j, delta, nivel;
    int casos, i;
    scanf("%d", &casos);

    for (i = 0; i < casos; i++) {
        scanf("%lld", &cartasAt);

        delta = (unsigned long long int)(sqrtl(1 + 24 * (cartasAt)));
        nivel = (unsigned long long int)floor(
            (unsigned long long int)((delta - 1) / 6));

        printf("%lld\n", nivel);

        for (j = 1; cartasAt >= (j * 2 + j - 1); j++) {
            cartasAt -= (j * 2 + j - 1);
        }

        printf("%lld\n", j - 1);
    }
}