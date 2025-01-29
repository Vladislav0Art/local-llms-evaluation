package org.jsoup.safety;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Parser;

public class GeneratedAddEnforcedAttribute {

    @Test
    public void addEnforcedAttribute() {
        Document doc = new Document();
        Safelist safe = new Safelist();
        safe.addEnforcedAttribute("a", "data-foo", "bar");
        assert !safe.getEnforcedAttributes("a data-foo").containsKey("bar");
        safedoc = new Document(doc);
        safedoc.save(Parser.xmlParser());
        Assert.assertFalse(safedoc.select("a").text().toLowerCase().contains("basic"));
    }

}