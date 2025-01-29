package org.jsoup.nodes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedTestOuterHtmlHead {

    @Test
    public void testOuterHtmlHead() throws IOException {
        Document document = new Document();
        Appendable result = document.outerHtmlHead(new java.util.ArrayList<>() {{
            add(document.outerHtml);
        }}, 0, null);
        assertEquals("<p>Hello World</p>", result.toString());
    }

}