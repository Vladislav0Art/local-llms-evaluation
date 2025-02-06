package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedGetWholeText {

    @Test
    public void getWholeText() {
        TextNode textNode = new TextNode("test");
        assertEquals("test", textNode.getWholeText());
    }

}