#include <math.h>
#include <stdio.h>
#include <stdlib.h>

int inclinadas(int niveis) {
    if (niveis == 1) return 2;
    return inclinadas(niveis - 1) + 2 * niveis;
}

int deitadas(int niveis) {
    if (niveis == 1) return 0;
    return deitadas(niveis - 1) + niveis - 1;
}

int quantasCartas(int niveis) {
    int qtd;

    qtd = inclinadas(niveis) + deitadas(niveis);

    return qtd;
}

int main() {
    int casos = 0, cartas, i, niveis = 1, ct = 0;

    scanf("%d", &casos);

    for (i = 0; i < casos; i++) {
        ct = 0;
        scanf("%d", &cartas);

        if (cartas < 7) {
            niveis = 1;
        } else if (cartas < 2) {
            niveis = 0;
        } else {
            while (ct == 0) {
                if (cartas >= quantasCartas(niveis)) {
                    if (cartas > quantasCartas(niveis + 1)) {
                        niveis++;
                        continue;
                    } else if (cartas == quantasCartas(niveis + 1)) {
                        niveis++;
                        ct = 1;
                    }
                }
                ct = 1;
            }
        }

        printf("%d\n", niveis);
    }

    return 0;
}