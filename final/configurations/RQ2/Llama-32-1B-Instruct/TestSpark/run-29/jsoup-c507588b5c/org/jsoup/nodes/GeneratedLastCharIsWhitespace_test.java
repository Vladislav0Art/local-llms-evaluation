package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.TextNode;
import org.mockito.Mockito;

public class GeneratedLastCharIsWhitespace_test {

    @Test
    public void lastCharIsWhitespace_test() {
        StringBuilder sb = Mockito.mock(StringBuilder.class);
        assertEquals(true, TextNode.lastCharIsWhitespace(sb));
        sb.setLength(0);
        assertEquals(false, TextNode.lastCharIsWhitespace(sb));
    }

}