package org.jsoup.safety;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

public class GeneratedAddProtocolsScenario {

    private Document document = new Document();

    @Test
    public void addProtocolsScenario() {
        Safelist safelist = new Safelist();
        Document document = new Document();
        Element element = document.createElement("p");
        safelist.addProtocol("img", "image/jpeg");
        Assert.assertTrue(safelist.isSafeTag(element.tagName()));
    }

}