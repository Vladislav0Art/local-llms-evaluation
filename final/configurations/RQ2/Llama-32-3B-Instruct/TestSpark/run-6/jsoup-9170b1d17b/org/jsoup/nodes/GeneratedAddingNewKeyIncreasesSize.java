package org.jsoup.nodes;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class GeneratedAddingNewKeyIncreasesSize {

    @Test
    public void addingNewKeyIncreasesSize() throws IOException {
        Document doc = Jsoup.parse("a=\"value\" b=\"value\"");
        Attributes attributes = doc.attributes();
        assertEquals(2, attributes.size());
        attributes.add("c", "value");
        assertEquals(3, attributes.size());
    }

}