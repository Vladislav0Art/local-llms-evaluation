package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedLastCharIsWhitespace_EffectsOnlyLastCharacter {

    @Test
    public void lastCharIsWhitespace_EffectsOnlyLastCharacter() {
        StringBuilder sb = new StringBuilder();
        assertTrue(TextNode.lastCharIsWhitespace(sb));
        sb.deleteCharAt(sb.length() - 1);
        assertFalse(TextNode.lastCharIsWhitespace(sb));
    }

}