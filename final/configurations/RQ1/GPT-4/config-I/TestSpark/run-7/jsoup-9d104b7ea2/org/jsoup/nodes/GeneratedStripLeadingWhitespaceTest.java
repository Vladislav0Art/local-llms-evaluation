package org.jsoup.nodes;

import org.jsoup.nodes.Document.OutputSettings;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

public class GeneratedStripLeadingWhitespaceTest {

    @Test
    public void stripLeadingWhitespaceTest() {
        String strippedText = TextNode.stripLeadingWhitespace("   Hello World ");
        assertEquals(strippedText, "Hello World ");
    }

}