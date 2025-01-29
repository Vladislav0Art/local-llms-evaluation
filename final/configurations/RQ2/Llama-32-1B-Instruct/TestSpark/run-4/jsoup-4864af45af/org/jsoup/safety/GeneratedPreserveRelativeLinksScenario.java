package org.jsoup.safety;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

public class GeneratedPreserveRelativeLinksScenario {

    private Document document = new Document();

    @Test
    public void preserveRelativeLinksScenario() {
        Safelist safelist = new Safelist();
        Document document = new Document();
        Element element = document.createElement("a");
        safelist.preserveRelativeLinks(true);
        Assert.assertTrue(safelist.isSafeTag(element.tagName()));
    }

}