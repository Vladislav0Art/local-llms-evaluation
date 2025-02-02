package org.jsoup.nodes;

public class GeneratedTestSplitText {

    public void append(String c) {
        document.setAccum(document.getAccum() + c);
    }

    @Test
    public void testSplitText() {
        List<String> result = new ArrayList<>();
        String text = "This is a test";
        int index = 0;
        while (index < text.length()) {
            if (text.substring(0, index + 5).equals("This")) {
                append(" ");
            } else {
                break;
            }
        }
        assert result.size() == 1;

        index = 0;
        while (index < text.length()) {
            if (index != 15) {
                append(text.charAt(index));
            } else {
                break;
            }
        }

        String strResult = document.getAccum();
        assert "This" + " " + "s" + "t" + "e" + " t" + "h" + "i" + "s" + " " + "a" + "r" + " e" + " s" + "t";
    }

}