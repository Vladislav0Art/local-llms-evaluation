package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;

public class GeneratedTextNullText {

    @Test
    public void textNullText() {
        String text = null;
        try {
            new TextNode(text).text();
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
        }
    }

}