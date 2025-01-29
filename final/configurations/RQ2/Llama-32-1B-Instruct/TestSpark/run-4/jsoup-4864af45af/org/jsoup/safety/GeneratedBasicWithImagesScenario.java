package org.jsoup.safety;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

public class GeneratedBasicWithImagesScenario {

    private Document document = new Document();

    @Test
    public void basicWithImagesScenario() {
        document.addTag("img", "image.jpg");
        Safelist safelist = new Safelist();
        Assert.assertTrue(safelist.isSafeTag("img"));
        Document document2 = new Document();
        Element element2 = document2.createElement("img");
        element2.appendChild(document2.createTextNode("Hello, world!"));
        Safelist safelist1 = new Safelist();
        Assert.assertFalse(safelist1.isSafeTag(element2.tagName()));
    }

}