package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class GeneratedAppendCharacterToStringBuilder {

    @Test
    public void appendCharacterToStringBuilder() {
        StringBuilder sb = new StringBuilder();
        sb.append('a');

        Appendable accum = sb;
        accum.append('b');
        accum.append('c');

        assertEquals("abc", accum.toString());
    }

}