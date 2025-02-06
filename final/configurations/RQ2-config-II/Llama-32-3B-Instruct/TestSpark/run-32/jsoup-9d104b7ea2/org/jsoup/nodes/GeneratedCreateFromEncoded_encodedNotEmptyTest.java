package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.io.IOException;

public class GeneratedCreateFromEncoded_encodedNotEmptyTest {

    @Test
    public void createFromEncoded_encodedNotEmptyTest() {
        String encoded = "test";
        TextNode node = TextNode.createFromEncoded(encoded);
        assertNotNull(node);
        assertEquals("test", node.text());
    }
}

}