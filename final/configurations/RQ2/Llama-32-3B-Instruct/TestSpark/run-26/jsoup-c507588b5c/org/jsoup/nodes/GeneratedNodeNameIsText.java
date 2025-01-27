package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

import org.mockito.Mockito;
import org.jsoup.internal.StringUtil;

public class GeneratedNodeNameIsText {

    @Test
    public void nodeNameIsText() {
        TextNode node = new TextNode("Hello");
        assertEquals("text", node.nodeName());
    }

}