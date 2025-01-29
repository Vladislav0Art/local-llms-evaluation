package org.jsoup.safety;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Parser;

public class GeneratedSimpleText {

    @Test
    public void simpleText() {
        Document doc = new Document();
        Safelist safe = new Safelist();
        safe.simpleText().addTags("span", "style");
        assert !safe.isSafeTag("span style");
        safedoc = new Document(doc);
        safedoc.save(Parser.xmlParser());
        Assert.assertTrue(safedoc.select("a").text().toLowerCase().contains("simple"));
    }

}