class Solution {
    public int solution(int n, String control) {
        int answer = 0;
                
		int w = 0;
		int a = 0;
		int s = 0;
		int d = 0;
		for (int i = 0; i < control.length(); i++) {
			if(control.charAt(i) == 'w') {
				w += 1;
			} else if(control.charAt(i) == 'a') {
				a -= 10;
			} else if(control.charAt(i) == 's') {
				s -= 1;
			} else if(control.charAt(i) == 'd') {
				d += 10;
			}
		}
        return n+w+a+s+d;
    }
}