package org.jsoup.safety;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Parser;

public class GeneratedRemoveTags {

    @Test
    public void removeTags() {
        Document doc = new Document();
        Safelist safe = new Safelist();
        safe.removeTags("a");
        assert !safe.getEnforcedAttributes("a").isEmpty();
        safedoc = new Document(doc);
        safedoc.save(Parser.xmlParser());
        Assert.assertTrue(safedoc.select("a").text().toLowerCase().contains("span"));
    }

}