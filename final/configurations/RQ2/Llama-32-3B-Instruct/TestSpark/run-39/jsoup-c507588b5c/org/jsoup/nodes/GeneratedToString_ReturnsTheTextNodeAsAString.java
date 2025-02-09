package org.jsoup.nodes;

public class GeneratedToString_ReturnsTheTextNodeAsAString {

    private TextNode node;

    @Before
    public void setUp() {
        node = new TextNode("Hello, World!");
    }

    @Test
    public void toString_ReturnsTheTextNodeAsAString() {
        String expected = "<p>   Hello,<br>World!</p>";
        String actual = node.toString();
        assertEquals(expected, actual);
    }

    private TextNode clone;

    @Before
    public void cloneSetup() {
        clone = node.clone();
    }

}