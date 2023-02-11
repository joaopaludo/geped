#include <stdio.h>
#include <stdlib.h>

int main() {
    int tam = 0, lin = 0, col = 0;
    float quad = 0.0;

    while (scanf("%d", &tam) != EOF) {
        if ((tam % 2 != 0) && (tam >= 5) && (tam <= 101)) {
            int mat[tam][tam];
            quad = (float)(tam / 3);

            for (lin = 0; lin < tam; lin++) {
                for (col = 0; col < tam; col++) {
                    mat[lin][col] = 0;

                    if ((lin > quad - 1) && (col > quad - 1) &&
                        (lin < tam - quad) && (col < tam - quad)) {
                        mat[lin][col] = 1;
                    } else if (lin == col) {
                        mat[lin][col] = 2;
                    } else if (lin == (tam - col) - 1 &&
                               col == (tam - lin) - 1) {
                        mat[lin][col] = 3;
                    }

                    if ((lin == col) && (lin == round(tam / 2))) {
                        mat[lin][col] = 4;
                    }
                    printf("%d", mat[lin][col]);
                }
                printf("\n");
            }
            printf("\n");
        }
    }

    return 0;
}