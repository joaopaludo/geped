#include <math.h>
#include <stdio.h>
#include <stdlib.h>

float fn(float r, int n) {
    return 1 / r *
           (pow(((1 + r) / 2), (float)n) - (pow(((1 - r) / 2), (float)n)));
}

float sn(float r, int n) {
    int i = 0, soma = 0;
    for (i = 0; i < n; i++) {
        soma += fn(r, n);
    }
    return soma;
}

int main() {
    int ii = sqrt(-1);
    int t, r, m, i, maior = 0, v;
    float sl, somaf = 0.0;

    scanf("%d%d", &t, &m);
    r = ii * (sqrt((4 * t) - 1));

    int lista[m];

    for (i = 0; i < m; i++) {
        scanf("%d", &lista[i]);
    }

    for (i = 0; i < m; i++) {
        if (lista[i] > maior) {
            maior = lista[i];
        }
    }

    sl = sn(r, maior);

    for (i = 0; i < m; i++) {
        somaf += fn(r, lista[i]);
    }

    v = (sl - somaf);

    printf("%d", (v % (int)(pow(10, 9) + 9)));

    return 0;
}