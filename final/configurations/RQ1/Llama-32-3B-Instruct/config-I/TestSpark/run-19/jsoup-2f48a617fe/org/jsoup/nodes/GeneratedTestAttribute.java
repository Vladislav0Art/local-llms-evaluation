package org.jsoup.nodes;

import org.jsoup.Jsoup;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestAttribute {

    @Test
    public void testAttribute() {
        Document doc = new Document();
        Element div = doc.selectFirst("div[foo]");
        // The attribute 'foo' is not generated for the <div> element
        assertEquals("", div.attributes());
    }

}