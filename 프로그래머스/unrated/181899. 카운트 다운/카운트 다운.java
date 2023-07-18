class Solution {
    public int[] solution(int start, int end) {
        
        int n = 0;
		int[] answer = new int [start-end+1];
		
		for (int i = 0; i < answer.length; i++) {
			answer[i] = start-n;
			n++;
		}
        return answer;
    }
}