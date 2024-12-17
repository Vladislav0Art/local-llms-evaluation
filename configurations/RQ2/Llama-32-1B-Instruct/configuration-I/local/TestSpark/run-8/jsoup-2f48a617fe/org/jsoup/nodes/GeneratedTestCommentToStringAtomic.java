package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class GeneratedTestCommentToStringAtomic {

    private static String data = "Example text";

    /**
     * Test that comment creation is atomic.
     */

    @Test
    public void testCommentToStringAtomic() {
        doc.appendChild(doc.createElement("comment"));
        Element comment = (Element) doc.evaluate("//comment()[1]", doc, null, java.util.NamespaceDeclaration.).firstResult();
        String output = comment.toString();
        assertEquals(data, output);
    }

}