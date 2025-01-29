package org.jsoup.safety;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.jsoup.internal.Normalizer.lowerCase;

public class GeneratedBasicWithImagesIsSafe {

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
    public void basicWithImagesIsSafe() {
        Safelist safelistWithBasicImagesTag = new Safelist();
        safelistWithBasicImagesTag.addTags("img");
        Safelist[] safelistWithAllAttributes = {safelistWithBasicImagesTag};
        Assert.assertTrue(safelist.isSafeAttribute("basic_with_images", "style", "color: red; width: 100px; height: 50px;"));
    }

}