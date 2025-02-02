package org.jsoup.nodes;

import org.jsoup.Jsoup;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestDocumentCreation {

    @Test
    public void testDocumentCreation() {
        Document doc = new Document();
        assertEquals(null, doc.outputSettings().setXmlDeclaration(true));
        doc.outputSettings().setXmlDeclaration(false);
        assertEquals("<root><body></body></root>", doc.html());
    }

}