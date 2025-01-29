package org.jsoup.safety;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.jsoup.internal.Normalizer.lowerCase;

public class GeneratedBasicIsSafe {

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
    public void basicIsSafe() {
        Safelist safelistWithBasicTag = new Safelist();
        safelistWithBasicTag.addAttributes("style", "color: red;");
        Assert.assertTrue(safelist.isSafeAttribute("basic", "style", "color: red;"));
    }

}