#include <math.h>
#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main() {
    int casos, i = 0, contLetNum = 0, contMaiMin = 0, tot = 0;
    char senha[17];

    scanf("%d", &casos);
    while (casos--) {
        scanf("%s", senha);
        if (senha[strlen(senha) - 1] == '\n') senha[strlen(senha) - 1] = '\0';

        for (i = 0; i < (strlen(senha)); i++) {
            senha[i] = tolower(senha[i]);
        }

        for (i = 0; i < (strlen(senha)); i++) {
            if ((senha[i] == 'a') || (senha[i] == 'e') || (senha[i] == 'i') ||
                (senha[i] == 'o') || (senha[i] == 's')) {
                contLetNum++;
            } else {
                contMaiMin++;
            }
        }

        tot = pow(3, contLetNum) * pow(2, contMaiMin);

        printf("%d\n", tot);
        contLetNum = 0;
        contMaiMin = 0;
    }
    return 0;
}