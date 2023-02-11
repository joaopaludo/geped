#include <stdio.h>
#include <stdlib.h>

int main() {
    int curupira = 0, boitata = 0, boto = 0, mapinguari = 0, iara = 0,
        total = 0;

    scanf("%d", &curupira);
    scanf("%d", &boitata);
    scanf("%d", &boto);
    scanf("%d", &mapinguari);
    scanf("%d", &iara);
    fflush(stdin);

    total = ((curupira * 300) + (boitata * 1500) + (boto * 600) +
             (mapinguari * 1000) + (iara * 150) + 225);

    printf("%d\n", total);

    return 0;
}