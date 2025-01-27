package org.jsoup.nodes;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class GeneratedRemovingNonExistingKeyDoesNotChangeSize {

    @Test
    public void removingNonExistingKeyDoesNotChangeSize() throws IOException {
        Document doc = Jsoup.parse("a=\"value\" b=\"value\"");
        Attributes attributes = doc.attributes();
        assertEquals(2, attributes.size());
        attributes.remove("c");
        assertEquals(2, attributes.size());
    }

}