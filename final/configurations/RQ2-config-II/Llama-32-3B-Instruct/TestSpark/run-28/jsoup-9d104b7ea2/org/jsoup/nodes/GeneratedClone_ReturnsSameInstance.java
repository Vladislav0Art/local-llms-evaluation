package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.concurrent.ExecutionException;

public class GeneratedClone_ReturnsSameInstance {

    @Test
    public void clone_ReturnsSameInstance() {
        TextNode textNode = new TextNode("example");
        assertNotNull(textNode.clone());
        assertEquals(textNode, textNode.clone());
    }

}