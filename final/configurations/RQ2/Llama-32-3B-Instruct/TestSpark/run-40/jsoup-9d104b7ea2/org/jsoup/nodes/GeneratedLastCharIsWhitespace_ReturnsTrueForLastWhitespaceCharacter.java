package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class GeneratedLastCharIsWhitespace_ReturnsTrueForLastWhitespaceCharacter {

    @Test
    public void lastCharIsWhitespace_ReturnsTrueForLastWhitespaceCharacter() {
        StringBuilder sb = new StringBuilder(" abc");
        assertTrue(TextNode.lastCharIsWhitespace(sb));
    }

}