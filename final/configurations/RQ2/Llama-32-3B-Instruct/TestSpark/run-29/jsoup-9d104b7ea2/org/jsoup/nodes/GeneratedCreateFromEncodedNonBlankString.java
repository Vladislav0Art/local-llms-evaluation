package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;

public class GeneratedCreateFromEncodedNonBlankString {

    @Test
    public void createFromEncodedNonBlankString() {
        assertEquals("test", TextNode.createFromEncoded("test"));
    }

}