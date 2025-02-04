package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

public class Generated[
Entities escape][unescapedString]

Test {

    private TextNode textNode = new TextNode("Hello World");

    @Test
    public void [Entities escape][unescapedString]Test() {
        String unescapedString = "Hello World";
        StringBuilder escapedStringBuilder = new StringBuilder();
        Entities.escape(escapedStringBuilder, unescapedString, null, false, false, true, true);
        assertEquals(testEncodedText, escapedStringBuilder.toString());
    }

}