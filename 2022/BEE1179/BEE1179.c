#include <stdio.h>
#include <stdlib.h>

int main() {
    int par[5], impar[5], cont = 0, n, cntpar = 0, cntimpar = 0, i;

    while (cont < 15) {
        scanf("%d", &n);

        if (n % 2 != 0) {
            impar[cntimpar] = n;
            cntimpar++;
        } else {
            par[cntpar] = n;
            cntpar++;
        }

        if (cntimpar == 5) {
            // mostrar ímpares
            for (i = 0; i < 5; i++) {
                printf("impar[%d] = %d\n", i, impar[i]);
            }

            // zerar contador ímpar
            cntimpar = 0;
        }

        if (cntpar == 5) {
            // mostrar pares
            for (i = 0; i < 5; i++) {
                printf("par[%d] = %d\n", i, par[i]);
            }

            // zerar contador par
            cntpar = 0;
        }

        cont++;
    }

    for (i = 0; i < cntimpar; i++) {
        printf("impar[%d] = %d\n", i, impar[i]);
    }

    for (i = 0; i < cntpar; i++) {
        printf("par[%d] = %d\n", i, par[i]);
    }

    return 0;
}
