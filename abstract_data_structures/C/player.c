#include "player.h"

void create(struct Player *p){
    p->games = 0;
    p->goals = 0;
    p->assists = 0;
}

void setPlayerStats(struct Player *p, int goals, int assists, int games){
    p->games = games;
    p->goals = goals;
    p->assists = assists;
}