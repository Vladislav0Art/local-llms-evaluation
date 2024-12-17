package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;

public class GeneratedIsBlankTextNodeEmptyString {

    @Test
    public void isBlankTextNodeEmptyString() {
        boolean result = new TextNode("").isBlank();
        assertTrue(result);
    }

}