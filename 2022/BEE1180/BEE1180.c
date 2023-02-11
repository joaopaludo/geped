#include <stdio.h>
#include <stdlib.h>

int main() {
    int i, menor = 0, posm = 0, n = 0;
    scanf("%d", &n);

    int x[n];

    for (i = 0; i < n; i++) {
        scanf("%d", &x[i]);
    }

    menor = x[0];
    for (i = 0; i < n; i++) {
        if (x[i] < menor) {
            menor = x[i];
            posm = i;
        }
    }

    printf("Menor valor: %d\n", menor);
    printf("Posicao: %d\n", posm);

    return 0;
}