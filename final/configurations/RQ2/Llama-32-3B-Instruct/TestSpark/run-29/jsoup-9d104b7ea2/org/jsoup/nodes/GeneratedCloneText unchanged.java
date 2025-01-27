package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;

public class GeneratedCloneText unchanged {

    @Test
    public void cloneText

    unchanged() {
        String text = "Test";
        TextNode textNode = new TextNode(text);
        TextNode cloned = textNode.clone();
        assertEquals(text, cloned.text());
    }

}