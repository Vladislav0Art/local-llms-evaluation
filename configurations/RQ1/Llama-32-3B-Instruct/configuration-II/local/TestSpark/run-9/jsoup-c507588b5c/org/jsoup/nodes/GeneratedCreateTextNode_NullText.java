package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;

public class GeneratedCreateTextNode_NullText {

    @Test
    public void createTextNode_NullText() {
        assertThrows(NullPointerException.class, () -> new TextNode(null));
    }

}