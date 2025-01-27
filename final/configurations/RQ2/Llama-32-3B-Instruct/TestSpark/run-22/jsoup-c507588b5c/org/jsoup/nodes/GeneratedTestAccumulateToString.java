package org.jsoup.nodes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedTestAccumulateToString {

    @Test
    public void testAccumulateToString() {
        Appendable accum = new ByteArrayOutputStream();
        Document document = Document.create("html");
        document.appendChild(document.createElement("div")).setTextContent("test");
        accum.append(document.toString());
        assertEquals("<div>test</div>", accumulateToString(accum));
        accum.clear();
        document.appendChild(document.createElement("div")).setTextContent("");
        accum.append(document.toString());
        assertEquals("", accumulateToString(accum));
    }

}