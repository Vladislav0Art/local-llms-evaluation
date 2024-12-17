package org.jsoup.nodes;

public class GeneratedTest {

    @Test
    public void testCreateFromEncoded() {
        String encodedText = "Hello, World!";
        TextNode textNode = TextNode.createFromEncoded(encodedText);
        assertNotNull(textNode);
        assertEquals("Hello, World!", textNode.text());
    }

    @Test
    public void testSplitText() {
        MockTextNode textNode = new MockTextNode();
        textNode.text("Hello");
        int offset = 6;
        TextNode result = textNode.splitText(offset);
        assertNotNull(result);
        assertTrue(result.value.equals("Hello"));
        assertEquals(1, result.siblingIndex);
    }

    @Test
    public void testGetWholeText() {
        MockTextNode textNode = new MockTextNode();
        textNode.text("Hello");
        String expectedValue = "Hello";
        assertEquals(expectedValue, textNode.getWholeText());
    }

    @Test
    public void testStripLeadingWhitespace() {
        List<String> list = new ArrayList<>();
        list.add("  Hello ");
        TextNode textNode = new MockTextNode();
        textNode.text("World");
        textNode.stripLeadingWhitespace(list);
        assertEquals(1, list.size());
        assertTrue(list.get(0).equals("Hello"));
    }

    @Test
    public void testLastCharIsWhitespace() {
        String builder = new StringBuilder();
        builder.append('X');
        TextNode textNode = new MockTextNode();
        textNode.text(builder.toString());
        assertTrue(lastCharIsWhitespace(builder.toString()));
    }

    @Test
    public void testToString() {
        TextNode textNode = new MockTextNode();
        textNode.text("Hello, World!");
        String expectedValue = "<!DOCTYPE html><html><body>Hello, World!</body></html>";
        assertEquals(expectedValue, textNode.toString());
    }

}