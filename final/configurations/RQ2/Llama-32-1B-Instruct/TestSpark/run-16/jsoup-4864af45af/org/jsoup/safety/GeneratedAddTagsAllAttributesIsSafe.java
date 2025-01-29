package org.jsoup.safety;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import static org.jsoup.internal.Normalizer.lowerCase;

public class GeneratedAddTagsAllAttributesIsSafe {

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
    public void addTagsAllAttributesIsSafe() {
        Safelist safelistWithAddTagsTag = new Safelist();
        safelistWithAddTagsTag.addTags("a");
        Assert.assertTrue(safelist.isSafeAttribute("add_tags", "style", "color: red;");
    }

}