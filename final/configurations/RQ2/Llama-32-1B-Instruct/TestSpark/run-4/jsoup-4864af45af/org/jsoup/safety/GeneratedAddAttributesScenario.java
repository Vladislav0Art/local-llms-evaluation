package org.jsoup.safety;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

public class GeneratedAddAttributesScenario {

    private Document document = new Document();

    @Test
    public void addAttributesScenario() {
        Safelist safelist = new Safelist();
        Document document = new Document();
        Element element = document.createElement("p");
        safelist.addAttribute("style", "color: blue;");
        Assert.assertTrue(safelist.isSafeTag(element.tagName()));
        Safelist safelist2 = new Safelist(safelist);
        Assert.assertFalse(safelist2.isSafeTag(element.tagName()));
    }

}