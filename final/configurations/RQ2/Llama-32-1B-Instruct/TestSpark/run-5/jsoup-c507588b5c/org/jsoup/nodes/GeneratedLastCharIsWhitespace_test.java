package org.jsoup.nodes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedLastCharIsWhitespace_test {

    @Test
    public void lastCharIsWhitespace_test() {
        StringBuilder sb = new StringBuilder();
        assertTrue(lastCharIsWhitespace(sb));
    }

}