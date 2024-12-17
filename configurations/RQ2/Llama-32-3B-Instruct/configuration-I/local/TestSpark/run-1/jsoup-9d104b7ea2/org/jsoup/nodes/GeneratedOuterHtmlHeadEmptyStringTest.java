package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.io.ByteArrayOutputStream;

public class GeneratedOuterHtmlHeadEmptyStringTest {

    @Test
    public void outerHtmlHeadEmptyStringTest() throws IOException {
        ByteArrayOutputStream ba = new ByteArrayOutputStream();
        Document.OutputSettings out = new Document.OutputSettings(ba);
        TextNode node = new TextNode("");
        node.outerHtmlHead(ba, 0, out);
        assertEquals("", ba.toString());
    }

}