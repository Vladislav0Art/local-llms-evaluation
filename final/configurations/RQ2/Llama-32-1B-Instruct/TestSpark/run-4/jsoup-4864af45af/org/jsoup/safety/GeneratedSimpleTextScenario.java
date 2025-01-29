package org.jsoup.safety;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

public class GeneratedSimpleTextScenario {

    private Document document = new Document();

    @Test
    public void simpleTextScenario() {
        document.addTag("p", "Hello, world!");
        Safelist safelist = new Safelist();
        Assert.assertTrue(safelist.isSafeTag("p"));
    }

}