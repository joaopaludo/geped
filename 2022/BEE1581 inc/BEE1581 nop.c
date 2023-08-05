#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main() {
    int casos, i, j, pessoas, ctr = 0;
    scanf("%d", &casos);
    fflush(stdin);

    for (i = 0; i < casos; i++) {
        scanf("%d", &pessoas);
        fflush(stdin);
        char idiomas[pessoas][20];

        for (j = 0; j < pessoas; j++) {
            fgets(idiomas[j], 20, stdin);
            fflush(stdin);
            printf("%d", strlen(idiomas[j]));

            if ((idiomas[j][strlen(idiomas[j])]) == '\n') {
                idiomas[j][strlen(idiomas[j])] = '\0';
            }
            printf("%d", strlen(idiomas[j]));
        }

        for (j = 1; j < pessoas; j++) {
            if (idiomas[j] != idiomas[j - 1]) {
                ctr = 1;
                printf("%s\n", idiomas[j]);
            }
        }

        if (ctr == 1) {
            printf("ingles");
        } else {
            printf("%s", idiomas[0]);
        }
    }
}