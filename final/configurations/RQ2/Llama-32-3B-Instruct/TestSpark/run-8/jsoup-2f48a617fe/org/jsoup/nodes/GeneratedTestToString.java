package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;

public class GeneratedTestToString {

    private String data;
    private int depth;
    private Document document;
    public static final String tag = "comment";

    public Comment(String data) {
        this.data = data;
    }

    public void outerHtmlHead(Appendable accum, int depth, Document.OutputSettings out) throws IOException {
        // implementation
    }

    public void outerHtmlTail(Appendable accum, int depth, Document.OutputSettings out) {
        // implementation
    }

    public String toString() {
        return data;
    }

    public boolean equals(Comment other) {
        return this.data.equals(other.data);
    }
}

public class GeneratedTest {

    @Test
    public void testToString() {
        Comment comment = new Comment("data");
        assertEquals("data", comment.toString());
    }

}