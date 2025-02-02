package org.jsoup.nodes;

public class GeneratedTest {

    public void append(String c) {
        document.setAccum(document.getAccum() + c);
    }

    @Test
    public void testIsBlank() {
        assert node.isBlank();
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

    @Test
    public void testGetAccum() {
        document.setAccum("This is a test");
        String result = document.getAccum();
        assert result.equals("This is a test");

        index = 0;
        while (index < result.length()) {
            if (result.substring(0, index + 5).equals("This")) {
                append(" ");
            } else {
                break;
            }
        }

        int newIndex = 0;
        while (newIndex < result.length()) {
            if (!Character.isWhitespace(result.charAt(newIndex))) {
                break;
            }
            newIndex++;
        }

        assert newIndex == result.length();

        index = result.length() - 1;
        while (index >= 0) {
            append(" ");
            if (!Character.isWhitespace(result.charAt(index))) {
                break;
            }
            index--;
        }

        String strResult = document.getAccum();
        assert "This" + " " + "s" + "t" + "e" + " t" + "h" + "i" + "s" + " " + "a" + "r" + " e" + " s" + "t";
    }

    @Test
    public void testAppend() {
        document.setAccum("This is a test");
        String result = document.getAccum();
        assert result.equals("This is a test");

        append("\n");

        index = 0;
        while (index < result.length()) {
            if (result.substring(0, index + 5).equals("This")) {
                append("\n");
            } else {
                break;
            }
        }

        String strResult = document.getAccum();
        assert "This\n is a test";
    }

}