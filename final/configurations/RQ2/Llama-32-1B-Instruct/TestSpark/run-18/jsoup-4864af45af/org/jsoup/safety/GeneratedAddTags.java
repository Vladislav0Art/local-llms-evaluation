package org.jsoup.safety;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Parser;

public class GeneratedAddTags {

    @Test
    public void addTags() {
        Document doc = new Document();
        Safelist safe = new Safelist();
        safe.addTags("span", "style");
        assert !safe.getEnforcedAttributes("span style").isEmpty();
        safedoc = new Document(doc);
        safedoc.save(Parser.xmlParser());
        Assert.assertTrue(safedoc.select("a").text().toLowerCase().contains("span"));
    }

}