class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String aa = Integer.toString(a) + Integer.toString(b);
		String bb = Integer.toString(b) + Integer.toString(a);
		
		if ((Integer.parseInt(aa)) > (Integer.parseInt(bb))) {
			return Integer.parseInt(aa);
		} else {
			return Integer.parseInt(bb);
		}
    }
}