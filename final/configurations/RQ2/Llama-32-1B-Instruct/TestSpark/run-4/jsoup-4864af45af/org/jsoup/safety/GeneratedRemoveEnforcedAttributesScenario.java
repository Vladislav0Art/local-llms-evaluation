package org.jsoup.safety;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

public class GeneratedRemoveEnforcedAttributesScenario {

    private Document document = new Document();

    @Test
    public void removeEnforcedAttributesScenario() {
        Safelist safelist = new Safelist();
        Document document = new Document();
        Element element = document.createElement("p");
        safelist.addAttribute("style", "color: red;");
        Assert.assertTrue(safelist.isSafeTag(element.tagName()));
        safelist.removeAttribute("style");
    }

}