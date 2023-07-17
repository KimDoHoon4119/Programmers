class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int sum1 = 0;
		int sum2 = num_list[0];
		
		for (int i = 0; i < num_list.length; i++) {
			sum1 += num_list[i];
		}
		for (int i = 1; i < num_list.length; i++) {
			sum2 *= num_list[i];
		}
        
        if (sum2 < (sum1*sum1)) {
            answer = 1;
        }
        return answer;
    }
}