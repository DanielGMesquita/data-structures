#include <stdio.h>
#include "queue.h"

int main(int argc, char *argv[]) {
    int e;
    struct Queue q;
    create(&q);

    insertItem(&q, 10);
    insertItem(&q, 20);
    insertItem(&q, 30);
    insertItem(&q, 40);
    insertItem(&q, 50);

    printf("Starting removal...\n");
    while (!isEmpty(q)) {
        e = removeItem(&q);
        printf("Element removed: %d\n", e);
    }

    printf("\n\nEnd of application\n\n");
    return 0;
}