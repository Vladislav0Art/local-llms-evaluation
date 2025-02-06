package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedIsBlank {

    @Test
    public void isBlank() {
        TextNode textNode = new TextNode("");
        assertTrue(textNode.isBlank());
    }

}