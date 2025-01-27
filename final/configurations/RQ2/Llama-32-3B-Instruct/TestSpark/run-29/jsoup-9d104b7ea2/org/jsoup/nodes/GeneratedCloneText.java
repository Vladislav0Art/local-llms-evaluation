package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;

public class GeneratedCloneText {

    @Test
    public void cloneText() {
        String text = "Test";
        TextNode textNode = new TextNode(text);
        TextNode cloned = textNode.clone();
        assertTrue(!cloned.text().equals(text));
    }

}