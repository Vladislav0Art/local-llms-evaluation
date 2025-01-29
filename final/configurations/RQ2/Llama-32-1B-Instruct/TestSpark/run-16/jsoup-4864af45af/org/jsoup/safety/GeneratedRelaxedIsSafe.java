package org.jsoup.safety;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.jsoup.internal.Normalizer.lowerCase;

public class GeneratedRelaxedIsSafe {

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
    public void relaxedIsSafe() {
        Safelist safelistWithRelaxedTag = new Safelist();
        Assert.assertTrue(safelist.isSafeTag("relaxed"));
    }

}