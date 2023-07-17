package assignment;


public class LongestSequence {

	public static void main(String[] args) {
		int count=1;
		char longestCharSOFar=' ';
		int maxCount=0;
		String str = "dadasldczldcadfdfsdasldasnsxscxjcjshdasldjsdjskdadkkk";
		for (int i = 0; i < str.length()-1; i++) {
			
			char firstCharacter = str.charAt(i);
			if(firstCharacter==str.charAt(i+1)) {
				count++;
				if(maxCount<count) {
					longestCharSOFar = firstCharacter;
					maxCount = count;
				}
			}
			else {

				count=1;
			}
			}
		System.out.println("Count of longest sequence of character "+longestCharSOFar+" is "+maxCount);

		}
		}