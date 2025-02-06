package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.concurrent.ExecutionException;

public class GeneratedIsBlank_NoText_ReturnsTrue {

    @Test
    public void isBlank_NoText_ReturnsTrue() {
        TextNode textNode = new TextNode("");
        assertTrue(textNode.isBlank());
    }

}