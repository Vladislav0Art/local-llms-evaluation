package org.jsoup.nodes;

public class GeneratedLastCharIsWhitespace_ChecksLastCharacterOnly {

    @Test
    public void lastCharIsWhitespace_ChecksLastCharacterOnly() {
        StringBuilder sb = new StringBuilder("Hello World!");
        assertTrue(lastCharIsWhitespace(sb));
    }

}