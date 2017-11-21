package interfaces;

public class BackwardsString extends SpecialString implements TextFunkifier {
	protected String s;

	public BackwardsString(String s) {
		super(s);
	}

	@Override
	public String funkifyText(String s) {
		// TODO Auto-generated method stub
		String end = "";
		char[] letters = s.toCharArray();
		for (int i = 0; i < s.toCharArray().length; i++) {
			end = end + letters[letters.length - 1 - i];
		}
		return end;
	}
}
