package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;

public class GeneratedClone_CloneObject {

    @Test
    public void clone_CloneObject() {
        TextNode textNode = new TextNode("test");
        TextNode clonedTextNode = textNode.clone();
        assertEquals(textNode.text(), clonedTextNode.text());
    }

}