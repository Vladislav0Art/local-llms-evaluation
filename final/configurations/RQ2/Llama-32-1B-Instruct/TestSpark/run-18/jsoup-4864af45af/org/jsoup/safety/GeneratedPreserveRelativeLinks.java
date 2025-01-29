package org.jsoup.safety;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Parser;

public class GeneratedPreserveRelativeLinks {

    @Test
    public void preserveRelativeLinks() {
        Document doc = new Document();
        Safelist safe = new Safelist();
        safe.preserveRelativeLinks(true);
        assert !safe.isSafeTag("img", Parser.xmlParser(), Attributerel);
    }

}