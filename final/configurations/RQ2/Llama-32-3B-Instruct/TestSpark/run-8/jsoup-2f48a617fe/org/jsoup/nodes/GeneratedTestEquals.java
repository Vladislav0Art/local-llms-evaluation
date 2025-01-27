package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;

public class GeneratedTestEquals {

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
    public void testEquals() {
        Comment comment1 = new Comment("data");
        Comment comment2 = new Comment("data");
        Comment comment3 = new Comment("otherData");

        assertTrue(comment1.equals(comment2));
        assertFalse(comment1.equals(comment3));
    }

}