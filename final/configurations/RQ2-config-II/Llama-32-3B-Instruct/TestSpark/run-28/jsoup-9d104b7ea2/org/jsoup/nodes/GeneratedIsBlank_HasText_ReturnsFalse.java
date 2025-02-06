package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.concurrent.ExecutionException;

public class GeneratedIsBlank_HasText_ReturnsFalse {

    @Test
    public void isBlank_HasText_ReturnsFalse() {
        TextNode textNode = new TextNode("example");
        assertFalse(textNode.isBlank());
    }

}