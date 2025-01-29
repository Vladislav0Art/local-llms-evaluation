package org.jsoup.safety;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

public class GeneratedBasicScenario {

    private Document document = new Document();

    @Test
    public void basicScenario() {
        Safelist safelist = new Safelist();
        Document document1 = new Document();
        Element element1 = document1.createElement("a");
        element1.appendChild(document1.createTextNode("Hello, world!"));
        Safelist safelist1 = new Safelist();
        Assert.assertTrue(safelist1.isSafeTag(element1.tagName()));
        Assert.assertFalse(safelist1.isSafeTag("script"));
    }

}