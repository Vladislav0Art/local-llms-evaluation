package org.jsoup.nodes;

public class Generated[TextNode]

stripLeadingWhitespaceTest {

    @Test
    public void [TextNode]stripLeadingWhitespaceTest() {
        String text = "   Hello World  ";
        assertEquals("Hello World", stripLeadingWhitespace(text));
    }

}