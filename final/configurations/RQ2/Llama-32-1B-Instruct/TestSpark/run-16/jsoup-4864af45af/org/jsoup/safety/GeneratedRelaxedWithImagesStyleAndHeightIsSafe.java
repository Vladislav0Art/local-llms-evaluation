package org.jsoup.safety;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import static org.jsoup.internal.Normalizer.lowerCase;

public class GeneratedRelaxedWithImagesStyleAndHeightIsSafe {

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
    public void relaxedWithImagesStyleAndHeightIsSafe() {
        Safelist safelistWithRelaxedTag = new Safelist();
        Assert.assertTrue(safelist.isSafeAttribute("relaxed", "style", "color: red; width: 100px; height: 50px;"));
    }

}