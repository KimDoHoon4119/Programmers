class Solution {
    public String solution(String myString) {
        String replace = myString.toLowerCase();
		String answer = "";
		
		
		for (int i = 0; i < myString.length(); i++) {
			if (replace.charAt(i) == 'a') {
				answer += "A";
			} else {
				answer += replace.charAt(i);
			}
		}
        return answer;
    }
}