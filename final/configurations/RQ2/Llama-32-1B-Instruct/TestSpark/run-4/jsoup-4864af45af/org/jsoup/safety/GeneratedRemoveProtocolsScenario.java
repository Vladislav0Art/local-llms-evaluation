package org.jsoup.safety;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

public class GeneratedRemoveProtocolsScenario {

    private Document document = new Document();

    @Test
    public void removeProtocolsScenario() {
        Safelist safelist = new Safelist();
        Document document = new Document();
        Element element = document.createElement("p");
        safelist.removeProtocol("img", "image/jpeg");
        Assert.assertFalse(safelist.isSafeTag(element.tagName()));
    }

}