package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedFromEncodedTests {

    @Test
    public void fromEncodedTests() {
        String encodedText = "&lt;Hello&gt;";
        assertTrue(TextNode.createFromEncoded(encodedText).text().equals("<Hello>"));
    }

}