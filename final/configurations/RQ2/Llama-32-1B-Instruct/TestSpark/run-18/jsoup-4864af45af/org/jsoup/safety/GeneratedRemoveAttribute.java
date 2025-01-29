package org.jsoup.safety;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Parser;

public class GeneratedRemoveAttribute {

    @Test
    public void removeAttribute() {
        Document doc = new Document();
        Safelist safe = new Safelist();
        safe.removeEnforcedAttribute("data-foo");
        assert !safe.getEnforcedAttributes("data-foo").isEmpty();
        safedoc = new Document(doc);
        safedoc.save(Parser.xmlParser());
        Assert.assertFalse(safedoc.select("a").text().toLowerCase().contains("basic"));
    }

}