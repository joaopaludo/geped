#include <stdio.h>
#include <stdlib.h>

int main() {
    const char NOMES[4][10] = {"Rolien", "Naej", "Elehcim", "Odranoel"};
    int casos, i, j, feedbacks, tipodef;

    scanf("%d", &casos);

    for (i = 0; i < casos; i++) {
        scanf("%d", &feedbacks);

        for (j = 0; j < feedbacks; j++) {
            scanf("%d", &tipodef);

            if (tipodef == 1) {
                printf("%s\n", NOMES[0]);
            } else if (tipodef == 2) {
                printf("%s\n", NOMES[1]);
            } else if (tipodef == 3) {
                printf("%s\n", NOMES[2]);
            } else {
                printf("%s\n", NOMES[3]);
            }
        }
    }

    return 0;
}
