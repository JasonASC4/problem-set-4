public class ProblemSet4 {
	
	public static void main(String[] args) {
		ProblemSet4 ps4 = new ProblemSet4();
		ps4.surroundMe("<<>>", "abc");
		//ps4.endsMeet("basl", 3);
		//ps4.middleMan("programming");
		//ps4.doubleVision("qwerty");
		//ps4.centered("programming", "ram");
		//ps4.upOrDown(12.2, 'c');
		//ps4.countMe("these are just some sample words", 'e');
		//ps4.isNotEqual("is not is not");
	}
	public String surroundMe(String in, String out) {
		int lengthIn = in.length();
		int lengthOut = out.length();
		if (in.equals(null) || out.equals(null)) {
			return null;
		}
		else if (lengthIn != 3) {
			return null;
		}
		else if (lengthOut != 4) {
			return null;
		}
		else {
		String outFirst = out.substring(0, 2);
		String outLast = out.substring(2,4);
		String lastString = outFirst + in + outLast;
		System.out.println(lastString);
		return (lastString);
		
		}
	}
	
	/*public int endsMeet(String str, int n) {
		return n;
	}*/
}
