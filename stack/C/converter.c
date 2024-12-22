#include <stdio.h>
#include "stack.h"

int main(int argc, char *argv[]) {
    int value, remainder;
    struct Stack s;
    create(&s);

    printf("Type a value...");
    scanf("%d", &value);

    while (value != 0) {
        remainder = value % 2;
        push(&s, remainder);
        value = value/2;
    }

    while (!isEmpty(s)) {
        remainder = pop(&s);
        printf("%d", remainder);
    }

    printf("\n\nEnd of application\n\n");
    return 0;
}