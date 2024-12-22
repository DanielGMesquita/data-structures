struct Player {
    int games;
    int goals;
    int assists;
};

void create(struct Player *p);
void setPlayerStats(struct Player *p, int goals, int assists, int games);