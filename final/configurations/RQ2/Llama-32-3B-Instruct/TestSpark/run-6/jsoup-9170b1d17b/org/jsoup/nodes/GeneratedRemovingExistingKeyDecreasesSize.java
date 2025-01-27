package org.jsoup.nodes;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class GeneratedRemovingExistingKeyDecreasesSize {

    @Test
    public void removingExistingKeyDecreasesSize() throws IOException {
        Document doc = Jsoup.parse("a=\"value\" b=\"value\"");
        Attributes attributes = doc.attributes();
        assertEquals(2, attributes.size());
        attributes.remove("a");
        assertEquals(1, attributes.size());
    }

}