package org.jsoup.safety;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Parser;

public class GeneratedAddAttribute {

    @Test
    public void addAttribute() {
        Document doc = new Document();
        Safelist safe = new Safelist();
        safe.addAttributes("a", "class", "style");
        assert !safe.getEnforcedAttributes("a style").isEmpty();
        safedoc = new Document(doc);
        safedoc.save(Parser.xmlParser());
        Assert.assertTrue(safedoc.select("a").text().toLowerCase().contains("basic"));
    }

}