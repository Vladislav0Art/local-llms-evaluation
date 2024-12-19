package org.jsoup.nodes;

public class GeneratedTestLastCharIsWhitespace {

    @Test
    public void testLastCharIsWhitespace() {
        StringBuilder sb = new StringBuilder("   ");
        assertEquals(" ", lastCharIsWhitespace(sb));
    }

}