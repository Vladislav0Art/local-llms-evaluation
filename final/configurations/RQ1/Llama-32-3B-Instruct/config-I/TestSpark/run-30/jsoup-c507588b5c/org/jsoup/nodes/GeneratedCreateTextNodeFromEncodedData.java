package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.util.Arrays;
import java.io.IOException;

public class GeneratedCreateTextNodeFromEncodedData {

    @Test
    public void createTextNodeFromEncodedData() {
        TextNode textNode = TextNode.createFromEncoded("&lt;Hello&gt; &amp;World&quot;");
        assertNotNull(textNode);
        assertEquals("#text", textNode.nodeName());
        assertEquals("Hello World", textNode.text());
    }

}