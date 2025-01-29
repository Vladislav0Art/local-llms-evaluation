package org.jsoup.nodes;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class GeneratedTest {

    private static final String HTML = "<html><head>Hello World!</head></html>";

    public static String generateHead() {
        return "<html><head>" + HTML + "</head>";
    }

    public static String generateBody(String content) {
        return "<html><body>" + content + "</body></html>";
    }

    @Test
    public void text() {
        TextNode node = new TextNode("Hello, World!");
        assertEquals("Hello, World!", node.text());
    }

    @Test
    public void isBlank() {
        TextNode node = new TextNode(" ");
        assertTrue(node.isBlank());
    }

    @Test
    public void splitText() {
        TextNode node = new TextNode("Hello, World! ");
        List<String> result = (List<String>) node.splitText(7);
        assertEquals(List.of("Hello, World!"), result);
    }

}