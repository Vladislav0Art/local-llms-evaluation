package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedToString {

    @Test
    public void toString() {
        TextNode textNode = new TextNode("test");
        assertEquals("<text>test</text>", textNode.toString());
    }

}