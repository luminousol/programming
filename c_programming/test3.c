#include <stdio.h>

int main() {
    char* p = "KOREA";
    printf("%s \n", p);
    printf("%s \n", p + 1);
    printf("%c \n", *p);
    printf("%c \n", *(p+3));
    printf("%c ", *p+4);    // 'K'의 아스키 값(75)에 4를 더한 값       
}