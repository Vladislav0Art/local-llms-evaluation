package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

import java.io.IOException;
import java.util.List;
import java.util.ArrayList;
import java.lang.StringBuilder;

public class GeneratedCreateTextNode_EmptyText {

    @Test
    public void createTextNode_EmptyText() {
        String text = "";
        TextNode textNode = new TextNode(text);
        assertNotNull(textNode.value());
        assertTrue(textNode.isBlank());
    }

}