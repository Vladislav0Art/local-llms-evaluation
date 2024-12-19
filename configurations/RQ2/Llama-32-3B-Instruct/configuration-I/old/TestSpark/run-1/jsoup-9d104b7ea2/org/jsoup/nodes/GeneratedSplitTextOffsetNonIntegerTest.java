package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.io.ByteArrayOutputStream;

public class GeneratedSplitTextOffsetNonIntegerTest {

    @Test
    public void splitTextOffsetNonIntegerTest() {
        TextNode node = new TextNode("Hello World");
        assertThrows(IllegalArgumentException.class, () -> node.splitText(3.5f));
    }

}