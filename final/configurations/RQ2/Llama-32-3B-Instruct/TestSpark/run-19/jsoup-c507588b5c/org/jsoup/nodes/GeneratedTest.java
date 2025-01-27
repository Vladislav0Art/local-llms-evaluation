package org.jsoup.nodes;

public class GeneratedTest {

    public String generateHead() {
        return "<head></head>";
    }

    public String generateTail() {
        return "</body>";
    }

    public String generateHead(String content) {
        return "<head>" + content + "</head>";
    }

    public String generateTail(String content) {
        return "</body>" + content + "</body>";
    }
}

public class GeneratedTest {

    @Test
    public void clone_Self() {
        TextNode node = new TextNode("hello world");
        TextNode cloned = node.clone();
        assertNotNull(cloned);
    }

    @Test
    public void splitText_Self() {
        TextNode node = new TextNode("hello world");
        TextNode result = node.splitText(6);
        assertNotNull(result);
        assertEquals("world", result.text());
    }

}