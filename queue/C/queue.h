struct Queue{
    int start;
    int end;
    int total;
    int values[10];
};

void create(struct Queue *q);
void insertItem(struct Queue *q, int element);
int removeItem(struct Queue *q);
int isEmpty(struct Queue q);
int isFull(struct Queue q);