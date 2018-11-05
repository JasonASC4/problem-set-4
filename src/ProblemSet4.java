public class ProblemSet4 {
	
	public static void main(String[] args) {
		ProblemSet4 ps4 = new ProblemSet4();
		ps4.surroundMe("<<>>", "abc");
		ps4.endsMeet("basl", 3);
		ps4.middleMan("programming");
		ps4.doubleVision("qwerty");
		ps4.centered("programming", "ram");
		ps4.upOrDown(12.2, 'c');
		ps4.countMe("these are just some sample words", 'e');
		ps4.isNotEqual("is not is not");
		ps4.triplets("aaabbbbccccc");
		ps4.addMe("a123b456c789", false);
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
	
	public String endsMeet(String str, int n) {
		if (str == null) {
			return null;
		}
		
		int strLength = str.length();
		
		if (strLength < 1 || strLength > 10 || n < 1 || n > strLength) {
			return null;
		}
		
		return (str.substring(0, n) + str.substring(strLength - n));
	}
	
	public String middleMan(String str) {
		if (str == null){
			return null;
			}
		else if (str.length() % 2 != 0){
			str = str.substring(str.length()/2 -1, str.length()/2 +2);
			return str;
		}
		else {
			return null;
		}
	}
	
	public String doubleVision(String str) {
		if (str == null) {
			return null;
		}
		else {
			String output = "";
			for(int n = 0; n < str.length(); n++) {
				output = output + str.charAt(n) + str.charAt(n);
			}
			return output;
		}
	}
	
	public boolean centered(String str, String target) {
		if (str == null || target == null) {
			return false;
		}
		
		int strLength = str.length();
		int tarLength = target.length();
		
		if (tarLength != 3) {
			return false;
		}
		
		String sub = "";
		String sub2 = "";
		if (strLength % 2 == 0) {
			sub = str.substring((strLength / 2 - 2), (strLength / 2 + 1));
			sub2 = str.substring((strLength / 2 - 1), (strLength / 2 + 2));
		} else {
			sub = str.substring((strLength / 2 - 1), (strLength / 2 + 2));
		}
		
		return (target.equals(sub) || target.equals(sub2)) ? true : false;
	}
	
	public int upOrDown (double number, char operation) {
		switch (operation) {
			case 'r':
				return (int) Math.round(number);
			case 'f':
				return (int) Math.floor(number);
			case 'c':
				return (int) Math.ceil(number);
			default:
				return -1;
		}
	}
	
	public int countMe(String text, char end) {
		if (text == null || Character.isLetter(end) == false) {
			return -1;
		}
		else {
			int count = 0;
			for (int i = 0; i < text.length(); i++) {
				if (text.charAt(i) == end) {
					count++;
			    }
			}
			return count;
		}
	}
	
	public boolean isNotEqual(String str) {
		if (str == null) {
			return false;
		}
		int isCount = 0;
		int notCount = 0;
		for (int i = 0; i < str.length()-1; i++) {
			if (str.charAt(i) == 'i' && str.charAt(i+1) == 's') {
				isCount++;
			}
			else if (str.charAt(i) == 'n' && str.charAt(i+1) == 'o' && str.charAt(i+2) == 't') {
				notCount++;
			} 
		}
		return isCount == notCount;
	}
	
	public int triplets(String str) {
		boolean alpha = true;
		for (int i = 0; i != str.length(); i++) {
	        if (!Character.isLetter(str.charAt(i))) {
	        	alpha = false;
	        }
	    }
		if (str == null || str.contains(" ") == true || alpha == false ) {
			return -1;
		}
		else {
			int count = 0;
			for (int i = 0;i < str.length(); i++) {
				if(i > 0 ) {
					if (str.charAt(i) == str.charAt(i-1) && str.charAt(i) == str.charAt(i+1)) {
					count++;
					}
				}
			}
			return count;
		}
	}
	
	public int addMe(String str, boolean digits) {
		if (str == null) {
			return -1;
		}
		int middle = 0;
		for (int i = 0; i < str.length();i++) {
			if (Character.isWhitespace(str.charAt(i))){
				return -1;
			}
			if(Character.isDigit(str.charAt(i)) && digits == true){
				middle = middle + Character.getNumericValue(str.charAt(i));
			}
			else if(Character.isDigit(str.charAt(i)) && digits == false) {
				//make hundreds before adding or doing whatever
				middle = middle + Character.getNumericValue(str.charAt(i));
			}
		}
		return middle;
	}	
}
