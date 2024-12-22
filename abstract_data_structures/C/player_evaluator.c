#include <stdio.h>
#include "player.h"

int main(int argc, char *argv[]) {
    int games, goals, assists;
    struct Player p;
    create(&p);

    printf("Type number of goals...");
    scanf("%d", &goals);

    printf("Type number of assists...");
    scanf("%d", &assists);

    printf("Type number of games...");
    scanf("%d", &games);

    setPlayerStats(&p, goals, assists, games);

    printf("Assists per game: %.2f\n", (double)p.assists/p.games);
    printf("Goals per game: %.2f\n", (double)p.goals/p.games);

    printf("\n\nEnd of application\n\n");
    return 0;
}

