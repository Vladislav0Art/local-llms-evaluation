package org.jsoup.safety;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.jsoup.internal.Normalizer.lowerCase;

public class GeneratedSimpleTextIsSafe {

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
    public void simpleTextIsSafe() {
        Safelist safelistWithSimpleTextTag = new Safelist();
        safelistWithSimpleTextTag.addTags("p");
        Safelist[] safelistWithAllAttributes = {safelistWithSimpleTextTag};
        Assert.assertTrue(safelist.isSafeAttribute("simple_text", "style", "color: red;"));
    }

}