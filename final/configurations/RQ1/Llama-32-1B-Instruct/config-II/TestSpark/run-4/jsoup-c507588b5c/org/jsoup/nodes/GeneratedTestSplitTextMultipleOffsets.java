package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class GeneratedTestSplitTextMultipleOffsets {

    private static TextNode document;

    @BeforeClass
    public static void setup() {
        document = new TextNode("<script>alert('Test')</script>");
    }

    @AfterClass
    public static void tearDown() {
        // No need to clean up here, since we're not using test fixtures
    }

    @Test
    public void testSplitTextMultipleOffsets() {
        TextNode result = document.splitText(5);
        String expected = "<p>Result</p>";
        assertEquals(expected, result.text("Result"));
    }

}