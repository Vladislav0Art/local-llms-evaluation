package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class GeneratedClone {

    @Test
    public void clone() {
        TextNode cloned = new TextNode("text").clone();
        assertNotNull(cloned);
        assertEquals(new TextNode("text"), cloned);
    }

}