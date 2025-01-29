package org.jsoup.safety;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

public class GeneratedNoneScenario {

    private Document document = new Document();

    @Test
    public void noneScenario() {
        Safelist safelist = new Safelist();
        Assert.assertTrue(safelist.isSafeTag("a"));
        Assert.assertFalse(safelist.isSafeTag("script"));
    }

}