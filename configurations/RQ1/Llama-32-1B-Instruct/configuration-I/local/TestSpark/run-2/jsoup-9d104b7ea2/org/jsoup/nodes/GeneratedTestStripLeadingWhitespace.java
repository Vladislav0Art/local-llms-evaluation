package org.jsoup.nodes;

public class GeneratedTestStripLeadingWhitespace {

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

}