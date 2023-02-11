#include <stdio.h>
#include <stdlib.h>

int main() {
    char ltr;
    int i, vzs, n1, n2;
    scanf("%d", &vzs);

    for (i = 0; i < vzs; i++) {
        scanf("%d%c%d", &n1, &ltr, &n2);

        if (n1 == n2) {
            printf("%d\n", n1 * n2);
            fflush(stdin);
        } else {
            if ((ltr >= 97) && (ltr <= 122)) {
                printf("%d\n", n1 + n2);
                fflush(stdin);
            } else {
                printf("%d\n", n2 - n1);
                fflush(stdin);
            }
        }
    }

    return 0;
}
