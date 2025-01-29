package org.jsoup.safety;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.jsoup.internal.Normalizer.lowerCase;

public class GeneratedNoneIsSafe {

    private Document document;
    private Safelist safelist;

    @BeforeEach
    public void setup() {
        String html = "<html><body>Hello <a href=\"#\">world</a></body></html>";
        document = new Document();
        Element body = document.createElement("body");
        body.appendChild(document.createNode(document, lowerCase(html)));
        Safelist none = new Safelist();
        safelist = new Safelist(none);
    }

    @Test
    public void noneIsSafe() {
        Safelist safelistWithNoneTag = safelist.none();
        Assert.assertTrue(safelist.isSafeTag(safelistWithNoneTag.getTags()[0].getName()));
    }

}