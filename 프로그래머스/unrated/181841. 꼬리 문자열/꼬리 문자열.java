class Solution {
    public String solution(String[] str_list, String ex) {
        String dec = "";
		String answer = "";
		
		for (int i = 0; i < str_list.length; i++) {
			dec = str_list[i];
			if (dec.contains(ex)) {
				answer += "";
			} else {
				answer += dec;
			}
		}
        return answer;
    }
}