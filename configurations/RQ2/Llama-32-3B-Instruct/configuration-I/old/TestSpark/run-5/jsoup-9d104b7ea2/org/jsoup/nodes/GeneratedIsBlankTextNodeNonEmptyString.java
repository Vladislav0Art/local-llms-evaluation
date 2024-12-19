package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;

public class GeneratedIsBlankTextNodeNonEmptyString {

    @Test
    public void isBlankTextNodeNonEmptyString() {
        boolean result = new TextNode("Hello").isBlank();
        assertFalse(result);
    }

}