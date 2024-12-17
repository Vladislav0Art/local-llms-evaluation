package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class GeneratedTestCommentEqualsNotEqualsAtomic {

    private Document doc = new Document();

    /**
     * Test that comment creation is atomic.
     */

    @Test
    public void testCommentEqualsNotEqualsAtomic() {
        String data = "Example text";
        doc.appendChild(doc.createElement("comment"));
        Comment comment1 = (Comment) doc.evaluate("//comment()[1]", doc, null, java.util.NamespaceDeclaration.).firstResult();
        Comment comment2 = (Comment) doc.evaluate("//comment()[2]", doc, null, java.util.NamespaceDeclaration.).firstResult();
        assertEquals(data, comment1.toString());
        assertEquals(data, comment2.toString());
    }

}