package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedIsBlank_returnsTrueForBlank {

    @Test
    public void isBlank_returnsTrueForBlank() {
        TextNode node = new TextNode("");
        assertTrue(node.isBlank());
    }

}