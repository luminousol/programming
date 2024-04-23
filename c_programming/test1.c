#include <stdio.h>

// 2023.03
// 완전수 구하는 문제 6, 28, 496, 8128
int test1(int n) {
    int i, sum = 0;

    for(i= 1; i <= n/2 ; i++) {
        if(n % i == 0) 
        sum += i;
    }
    if(n == sum)
        return 1;
    return 0;
}

int main(){
    int i, sum = 0;

    for(i = 2 ; i<= 100 ; i++) {
        if(test1(i))
        sum += i;
    }
    
    printf("%d", sum);
    return 0;
}
