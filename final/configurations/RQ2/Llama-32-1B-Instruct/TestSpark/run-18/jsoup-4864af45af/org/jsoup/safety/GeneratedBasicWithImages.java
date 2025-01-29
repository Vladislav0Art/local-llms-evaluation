package org.jsoup.safety;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Parser;

public class GeneratedBasicWithImages {

    @Test
    public void basicWithImages() {
        Document doc = new Document();
        Safelist safe = new Safelist();
        safe.basicWithImages().addTags("img", "alt");
        assert !safe.isSafeTag("span style a img alt");
        safedoc = new Document(doc);
        safedoc.save(Parser.xmlParser());
        Assert.assertTrue(safedoc.select("a").text().toLowerCase().contains("basic"));
    }

}