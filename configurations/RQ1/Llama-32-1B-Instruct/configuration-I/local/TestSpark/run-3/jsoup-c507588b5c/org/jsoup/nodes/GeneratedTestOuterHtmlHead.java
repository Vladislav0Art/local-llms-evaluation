package org.jsoup.nodes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTestOuterHtmlHead {

    @Test
    public void testOuterHtmlHead() {
        Appendable accum = new StringBuilder();
        Document doc = DocumentBuilder.create(null);
        Node root = doc.body().appendChild(doc.body());
        Node siblingIndex = 0;
        parentNode = null;

        outerHtmlHead(accum, 1, doc.OutputSettings()).assertNotEquals("  ");
    }

}