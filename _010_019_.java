// 010 짝수의 합
class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i = 1 ; i <= n/2 ; i++){
            answer += (i*2);
        }
        return answer;
    }
}


// 011 배열의 평균값
class Solution {
    public double solution(int[] numbers) {
        int answer = 0;
        int numberLength = numbers.length;
        for (int i = 0; i < numberLength ; i++ )
            answer += numbers[i];
        return (double) answer/numberLength;
    }
}

// 011 양꼬치 

class Solution {
    public int solution(int n, int k) {
        
        int service = n/10;
        
        int answer = (n * 12000) + ((k - service) * 2000) ;
        return answer;
    }
}

// 012 편지

class Solution {
    public int solution(String message) {
        int answer = message.length()*2;
        return answer;
    }
}

// 013 최댓값 만들기
import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        Arrays.sort(numbers);
        
        int arrayLength = numbers.length;
        
        return numbers[arrayLength-2]*numbers[arrayLength-1];
    }
}