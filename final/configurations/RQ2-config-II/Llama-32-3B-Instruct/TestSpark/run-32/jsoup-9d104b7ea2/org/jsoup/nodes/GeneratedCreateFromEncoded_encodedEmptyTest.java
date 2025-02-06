package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.io.IOException;

public class GeneratedCreateFromEncoded_encodedEmptyTest {

    @Test
    public void createFromEncoded_encodedEmptyTest() {
        String encoded = "";
        TextNode node = TextNode.createFromEncoded(encoded);
        assertNotNull(node);
    }

}