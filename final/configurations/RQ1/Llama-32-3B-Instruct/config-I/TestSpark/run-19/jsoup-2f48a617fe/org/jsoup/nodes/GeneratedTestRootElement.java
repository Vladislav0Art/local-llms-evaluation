package org.jsoup.nodes;

import org.jsoup.Jsoup;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestRootElement {

    @Test
    public void testRootElement() {
        Document doc = new Document();
        Element root = doc.body();
        assertEquals(null, root.asXmlDeclaration());
    }

}