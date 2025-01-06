#include "queue.h"

void create(struct Queue *q) {
    q->start = 0;
    q->end = 0;
    q->total = 0;
}

void insertItem(struct Queue *q, int element) {
    q->values[q->end] = element;
    q->end = (q->end + 1) % 10;
    q->total++;
}

int removeItem(struct Queue *q) {
    int element = q->values[q->start];
    q->start = (q->start + 1) % 10;
    q->total--;
    return element;
}

int isEmpty(struct Queue q) {
    return (q.total == 0);
}

int isFull(struct Queue q) {
    return (q.total == 10);
}