package org.jsoup.safety;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Parser;

public class GeneratedRelaxed {

    @Test
    public void relaxed() {
        Document doc = new Document();
        Safelist safe = new Safelist();
        safe.relaxed().addTags("span", "style");
        assert !safe.isSafeTag("span style");
        safedoc = new Document(doc);
        safedoc.save(Parser.xmlParser());
        Assert.assertTrue(safedoc.select("a").text().toLowerCase().contains("relaxed"));
    }

}