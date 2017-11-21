package interfaces;

public class MixedCapsString extends SpecialString implements TextFunkifier {
	protected String s;

	public MixedCapsString(String s) {
		super(s);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String funkifyText(String s) {
		// TODO Auto-generated method stub
		String end = "";
		char[] letters = s.toCharArray();
		for (int i = 0; i < s.toCharArray().length; i++) {
			Character current = letters[i];
			if (i % 2 == 1) {
				current = Character.toUpperCase(current);
			} else {
				current = Character.toLowerCase(current);
			}
			end = end + current;
		}
		return end;
	}
}
