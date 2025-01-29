package org.jsoup.safety;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

public class GeneratedRemoveTagsScenario {

    private Document document = new Document();

    @Test
    public void removeTagsScenario() {
        Safelist safelist = new Safelist();
        Document document = new Document();
        Element element = document.createElement("a");
        safelist.addTag("img", "image.jpg");
        Assert.assertTrue(safelist.isSafeTag(element.tagName()));
        safelist.removeTags("a");
        Assert.assertFalse(safelist.isSafeTag(element.tagName()));
    }

}