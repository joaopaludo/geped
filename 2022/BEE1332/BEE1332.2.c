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

        if (strlen(plv) == 5) {
            printf("3\n");
        } else if (((plv[0] == 'o') && (plv[1] == 'n')) ||
                   ((plv[0] == 'o') && (plv[2] == 'e')) ||
                   ((plv[1] == 'n') && (plv[2] == 'e'))) {
            printf("1\n");
        } else {
            printf("2\n");
        }
    }
    return 0;
}
