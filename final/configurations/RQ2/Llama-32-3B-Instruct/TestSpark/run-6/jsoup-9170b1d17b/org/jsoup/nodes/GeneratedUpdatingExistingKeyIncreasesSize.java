package org.jsoup.nodes;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class GeneratedUpdatingExistingKeyIncreasesSize {

    @Test
    public void updatingExistingKeyIncreasesSize() throws IOException {
        Document doc = Jsoup.parse("a=\"value\" b=\"value\"");
        Attributes attributes = doc.attributes();
        assertEquals(2, attributes.size());
        attributes.update("b", "new value");
        assertEquals(2, attributes.size());
    }

}