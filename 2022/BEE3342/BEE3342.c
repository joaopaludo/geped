#include <math.h>
#include <stdio.h>
#include <stdlib.h>

int main() {
    int tam = 0, brancas = 0, pretas = 0;
    scanf("%d", &tam);
    fflush(stdin);

    if (tam % 2 == 0) {
        printf("%d casas brancas e %d casas pretas\n", ((tam * tam) / 2),
               ((tam * tam) / 2));
    } else {
        pretas = floor((tam * tam) / 2);
        brancas = (tam * tam) - pretas;
        printf("%d casas brancas e %d casas pretas\n", brancas, pretas);
    }

    return 0;
}