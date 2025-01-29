package org.jsoup.nodes;

public class GeneratedTest {

    public static String createTextNode(String... str) {
        return str[0];
    }

    public static int toStringValue() {
        return 5;
    }
}

public class Test1 {

    @Test
    public void testText() {
        assertEquals("", new TextNode("").text());
        assertEquals("Hello World!", new TextNode("Hello\nWorld!").text());
        assertEquals("This is a line of text.", new TextNode("This is a line of \n\ntext.").text());
    }

    @Test
    public void testGetWholeText() {
        assertEquals("", new TextNode("").getWholeText());
        assertEquals("Hello World!", new TextNode("Hello\nWorld!").getWholeText());
        assertEquals("This is a line of text.", new TextNode("This is a line of \n\ntext.").getWholeText());
    }

    @Test
    public void testSplitText() {
        assertEquals("", new TextNode("").splitText(0));
        assertEquals("Hello World!", new TextNode("Hello\nWorld!").splitText(1));
        assertEquals("", new TextNode("This is a line of text.").splitText(-1));
    }

    @Test
    public void testClone() {
        TextNode node = new TextNode("");
        TextNode cloned = (TextNode) node.clone();
        assertEquals(node, cloned);
    }

    @Test
    public void testTextValuesWithNullValue() {
        assertFalse(new TextNode(null).text().isEmpty());
        assertTrue(new TextNode(null).text() == "");
    }

}