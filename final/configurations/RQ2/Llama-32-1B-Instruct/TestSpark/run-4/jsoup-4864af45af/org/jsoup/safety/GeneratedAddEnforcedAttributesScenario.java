package org.jsoup.safety;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

public class GeneratedAddEnforcedAttributesScenario {

    private Document document = new Document();

    @Test
    public void addEnforcedAttributesScenario() {
        Safelist safelist = new Safelist();
        Document document = new Document();
        Element element = document.createElement("p");
        safelist.addEnforcedAttribute("class", "my-class", "blue");
        Assert.assertTrue(safelist.isSafeTag(element.tagName()));
    }

}