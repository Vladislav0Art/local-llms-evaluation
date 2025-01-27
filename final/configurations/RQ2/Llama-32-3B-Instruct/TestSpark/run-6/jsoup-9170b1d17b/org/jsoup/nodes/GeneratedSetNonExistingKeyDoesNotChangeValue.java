package org.jsoup.nodes;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class GeneratedSetNonExistingKeyDoesNotChangeValue {

    @Test
    public void setNonExistingKeyDoesNotChangeValue() throws IOException {
        Document doc = Jsoup.parse("a=\"value\" b=\"value\"");
        Attributes attributes = doc.attributes();
        attributes.set("c", "new value");
        assertEquals("", attributes.get("c"));
    }
}

}