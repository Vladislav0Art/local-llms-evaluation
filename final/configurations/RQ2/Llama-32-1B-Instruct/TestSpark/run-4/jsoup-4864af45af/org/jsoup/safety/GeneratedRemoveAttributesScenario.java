package org.jsoup.safety;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

public class GeneratedRemoveAttributesScenario {

    private Document document = new Document();

    @Test
    public void removeAttributesScenario() {
        Safelist safelist = new Safelist();
        Document document = new Document();
        Element element = document.createElement("p");
        safelist.addAttribute("style", "color: blue;");
        Assert.assertTrue(safelist.isSafeTag(element.tagName()));
        safelist.removeAttribute("style");
        Assert.assertFalse(safelist.isSafeTag(element.tagName()));
    }

}