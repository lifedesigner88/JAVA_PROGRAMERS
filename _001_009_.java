// 001 나머지 구하기
class Solution {
    public int solution(int num1, int num2) {
        int answer = num1 % num2;
        return answer;
    }
}


// 002 두 수의 곱
class Solution {
    public int solution(int num1, int num2) {
        int answer = num1*num2;
        return answer;
    }
}


// 003 몫 구하기
class Solution {
    public int solution(int num1, int num2) {
        int answer = num1/num2;
        return answer;
    }
}


// 004 숫자 비교하기
class Solution {
    public int solution(int num1, int num2) {
        if(num1 == num2)
            return 1;
        return -1;
    }
}


// 005 두 수의 차
class Solution {
    public int solution(int num1, int num2) {
        return num1-num2;
    }
}


// 006 나이출력
class Solution {
    public int solution(int age) {
        int answer = 2022-age+1;
        return answer;
    }
}


// 007 두 수의 합
class Solution {
    public int solution(int num1, int num2) {
        int answer = num1 + num2;
        return answer;
    }
}


// 008 두 수의 나눗셈
class Solution {
    public int solution(int num1, int num2) {
        int answer = (num1 * 1000) / num2;
        return answer;
    }
}


// 009 각도기

class Solution {
    public int solution(int angle) {
        if(0 < angle && angle < 90)
            return 1;
        else if (angle == 90)
            return 2;
        else if (90 < angle && angle < 180)
            return 3;
        else
            return 4;      
    }
        
}
