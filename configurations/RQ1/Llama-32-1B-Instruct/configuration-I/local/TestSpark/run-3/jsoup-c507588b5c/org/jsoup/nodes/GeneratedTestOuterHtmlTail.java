package org.jsoup.nodes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTestOuterHtmlTail {

    @Test
    public void testOuterHtmlTail() {
        Appendable accum = new StringBuilder();
        Document doc = DocumentBuilder.create(null);
        Node root = doc.body().appendChild(doc.body());
        parentNode = null;

        outerHtmlTail(accum, 1, doc.OutputSettings()).assertNotEquals("  ");
    }

}