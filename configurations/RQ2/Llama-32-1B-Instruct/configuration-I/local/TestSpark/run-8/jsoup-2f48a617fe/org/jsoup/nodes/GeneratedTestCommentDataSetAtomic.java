package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class GeneratedTestCommentDataSetAtomic {

    private static String data = "Example text";

    /**
     * Test that comment creation is atomic.
     */

    @Test
    public void testCommentDataSetAtomic() {
        doc.appendChild(doc.createElement("comment"));
        Element comment = (Element) doc.evaluate("//comment()[1]", doc, null, java.util.NamespaceDeclaration.).firstResult();
        comment.setData(data);
        assertEquals(data, comment.data());
    }

}