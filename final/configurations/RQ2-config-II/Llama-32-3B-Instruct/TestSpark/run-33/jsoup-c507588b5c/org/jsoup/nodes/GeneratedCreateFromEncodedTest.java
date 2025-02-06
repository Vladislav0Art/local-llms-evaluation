package org.jsoup.nodes;

public class GeneratedCreateFromEncodedTest {

    private static final String WHITESPACE = "   ";
    private static final String BLANK = "";
    private static final String EMPTY_STRING = "";

    @Test
    public void createFromEncodedTest() {
        String encodedText = "a";
        TextNode node = TextNode.createFromEncoded(encodedText);

        Assert.assertEquals(encodedText, node.text());
    }

}