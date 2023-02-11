#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main() {
    int palavras, i = 0;
    scanf("%d", &palavras);
    fflush(stdin);
    char plv[6];

    for (i = 0; i < palavras; i++) {
        fgets(plv, 6, stdin);
        fflush(stdin);
        if (plv[strlen(plv) - 1] == '\n') plv[strlen(plv) - 1] = '\0';

        if (strlen(plv) == 3) {
            if (((plv[0] == 'o') && (plv[1] == 'n')) ||
                ((plv[0] == 'o') && (plv[2] == 'e')) ||
                ((plv[1] == 'n') && (plv[2] == 'e'))) {
                printf("1\n");
            } else if (((plv[0] == 't') && (plv[1] == 'w')) ||
                       ((plv[0] == 't') && (plv[2] == 'o')) ||
                       ((plv[1] == 'w') && (plv[2] == 'o'))) {
                printf("2\n");
            }
        } else {
            if (plv[0] == 't') {
                if (plv[1] == 'h') {
                    if (plv[2] == 'r') {
                        if (plv[3] == 'e' || plv[4] == 'e') {
                            printf("3\n");
                        }
                    } else if (plv[3] == 'e' && plv[4] == 'e')
                        printf("3\n");
                } else if (plv[2] == 'r' && plv[3] == 'e' && plv[4] == 'e')
                    printf("3\n");
            } else if (plv[1] == 'h' && plv[2] == 'r' && plv[3] == 'e' &&
                       plv[4] == 'e')
                printf("3\n");
        }
    }

    return 0;
}
