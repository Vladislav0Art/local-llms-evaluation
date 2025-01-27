package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.LeafNode;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public class GeneratedCreateFromEncoded_Test {

    @Test
    public void createFromEncoded_Test() {
        String encodedText = "UTF-8\\u202f";
        assertEquals(encodedText, TextNode.createFromEncoded(encodedText));
    }

}