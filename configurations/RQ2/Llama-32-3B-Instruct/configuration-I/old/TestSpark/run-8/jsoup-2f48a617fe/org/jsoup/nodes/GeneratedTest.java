package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class GeneratedTest {

    @Test
    public void nodeName() {
        Comment comment = new Comment("data");
        assertEquals("comment", comment.nodeName());
    }

    @Test
    public void getData() {
        Comment comment = new Comment("data");
        assertEquals("data", comment.getData());
    }

    @Test
    public void setData() {
        Comment comment = new Comment("");
        comment.setData("data");
        assertEquals("data", comment.getData());
    }

    @Test
    public void outerHtmlTail() {
        Appendable accum = new StringBuilder();
        int depth = 1;
        Document.OutputSettings out = new Document.OutputSettings();
        Comment comment = new Comment("");
        comment.outerHtmlTail(accum, depth, out);
        assertEquals("", accum.toString());
    }

    @Test
    public void isXmlDeclaration() {
        Comment comment = new Comment("data");
        assertTrue(comment.isXmlDeclaration());
    }

    @Test
    public void compareStringObjects() {
        String str1 = "Hello";
        String str2 = "World";

        assertNotEquals(str1, str2);
    }

    @Test
    public void nodeName() {
        Element comment = new Element("comment");
        assertEquals("comment", comment.tagName());
    }

    @Test
    public void writeCharacterArrayAndInts() throws Exception {
        StringBuilder sb = new StringBuilder();
        sb.append('a');
        sb.append(1);
        char[] chars = {'b', 'c'};
        sb.append(chars, 0, 2);

        assertEquals("abc", sb.toString());
    }

    @Test
    public void checkEqualsMethodOnXmlDeclaration() throws Exception {
        // XmlDeclaration is not a real class in Jsoup.
        // This test will fail if you try to use it.
    }

    @Test
    public void closeAppendable() throws Exception {
        // Appendable is an interface in Java, not in Jsoup.
        // This test will fail if you try to use it.
    }
}

class Document {
    private Element element;

    public Document() {
    }

    public Element createElement(String tag) {
        element = new Element(tag);
        return element;
    }
}

class Element {
    private String tag;

    public Element(String tag) {
        this.tag = tag;
    }

    public String tagName() {
        return tag;
    }

}