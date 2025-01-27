package org.jsoup.nodes;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class GeneratedSetExistingKeyUpdatesValue {

    @Test
    public void setExistingKeyUpdatesValue() throws IOException {
        Document doc = Jsoup.parse("a=\"value\" b=\"value\"");
        Attributes attributes = doc.attributes();
        assertEquals("value", attributes.get("a"));
        attributes.set("a", "new value");
        assertEquals("new value", attributes.get("a"));
    }

}