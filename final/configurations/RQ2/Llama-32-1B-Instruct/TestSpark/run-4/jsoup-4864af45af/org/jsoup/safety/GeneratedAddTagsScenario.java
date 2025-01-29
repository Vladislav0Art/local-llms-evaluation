package org.jsoup.safety;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

public class GeneratedAddTagsScenario {

    private Document document = new Document();

    @Test
    public void addTagsScenario() {
        Safelist safelist = new Safelist();
        Document document = new Document();
        Element element = document.createElement("a");
        safelist.addTag("img", "image.jpg");
        Assert.assertTrue(safelist.isSafeTag(element.tagName()));
        Safelist safelist2 = new Safelist(safelist);
        Assert.assertFalse(safelist2.isSafeTag(element.tagName()));
    }

}