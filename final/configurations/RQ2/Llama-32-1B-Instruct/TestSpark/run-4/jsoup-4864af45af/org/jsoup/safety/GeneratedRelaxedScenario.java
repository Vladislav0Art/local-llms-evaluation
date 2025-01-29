package org.jsoup.safety;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

public class GeneratedRelaxedScenario {

    private Document document = new Document();

    @Test
    public void relaxedScenario() {
        Safelist safelist = new Safelist();
        Document document = new Document();
        Element element = document.createElement("a");
        element.setAttribute("href", "https://example.com");
        Safelist safelist1 = new Safelist(safelist);
        Assert.assertTrue(safelist1.isSafeTag(element.tagName()));
    }

}