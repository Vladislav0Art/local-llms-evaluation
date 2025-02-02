package org.jsoup.nodes;

public class GeneratedGivenExistingTextNodeWhenSplittingAtOffset_returnsCorrectNodes {

    private String text;

    public TextNode(String text) {
        this.text = text;
    }

    public boolean isBlank() {
        return this.text.isEmpty();
    }

    public String getWholeText() {
        return this.text;
    }

    public static boolean lastCharIsWhitespace(String str) {
        if (str.length() == 0) {
            return true;
        } else {
            char lastChar = str.charAt(str.length() - 1);
            return lastChar == ' ';
        }
    }

    public String split(int offset) {
        if (offset < this.text.length()) {
            return this.text.substring(0, offset);
        } else {
            return "";
        }
    }

    public static boolean isValidSplit(String text, int offset) {
        return offset <= text.length();
    }
}

public class GeneratedTest {

    @Test
    public void givenExistingTextNodeWhenSplittingAtOffset_returnsCorrectNodes() {
        String expectedText = "Hello World!";
        TextNode existingTextNode = new TextNode(expectedText);
        String actualText = TextNode.isValidSplit(existingTextNode.getWholeText(), 1);
        assertEquals(String.valueOf(expectedText.charAt(0)), actualText);
    }

}