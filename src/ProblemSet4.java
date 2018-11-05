public class ProblemSet4 {
	
	public static void main(String[] args) {
		ProblemSet4 ps = new ProblemSet4();
	    System.out.println(ps.surroundMe("<<>>", "abc"));
		System.out.println(ps.endsMeet("qwerty", 2));
		System.out.println(ps.middleMan("candy"));
		System.out.println(ps.doubleVision("qwerty"));
		System.out.println(ps.centered("programming", "ram"));
		System.out.println(ps.upOrDown(12.7, 'r'));
		System.out.println(ps.countMe("one more batch of sample words", 'h'));
		System.out.println(ps.isNotEqual("is not is not is not"));
		System.out.println(ps.triplets("aaabbbbccccc"));
		System.out.println(ps.addMe("a123b456c789", false));
	}
	
	public String surroundMe(String out, String in) {
		if (out == null || in == null) {
			return null;
		}
		int outLength = out.length();
		int inLength = in.length();
		
		if (outLength != 4 || inLength != 3 || out.charAt(0) != out.charAt(1) || out.charAt(2) != out.charAt(3)) {
			return null;
		}
		
		return (out.substring(0, 2) + in + out.substring(2, 4));
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
		if (str == null) {
			return -1;
		}
		
		int length = str.length();
		int count = 0;
		for (int i = 0; i < length - 2; i++) {
			if ((str.charAt(i) < 'A' || (str.charAt(i) > 'Z' && str.charAt(i) < 'a') || str.charAt(i) > 'z')) {
				return -1;
			}
			
			if (str.charAt(i) == str.charAt(i + 1) && str.charAt(i) == str.charAt(i + 2)) {
				count++;
			}
		}
		
		return count;
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
