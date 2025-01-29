package org.jsoup.safety;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Parser;

public class GeneratedNone {

    @Test
    public void none() {
        Document doc = new Document();
        Safelist safe = new Safelist();
        Assert.assertFalse(safe.isSafeTag("a"));
    }

}