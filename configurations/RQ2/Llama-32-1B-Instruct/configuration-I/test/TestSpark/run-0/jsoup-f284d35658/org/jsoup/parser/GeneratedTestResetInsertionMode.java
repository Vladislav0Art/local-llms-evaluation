package org.jsoup.parser;

import org.jsoup.parser.HtmlTreeBuilder;
import org.junit.jupiter.api.Test;

public class GeneratedTestResetInsertionMode {

    @Test
    public void testResetInsertionMode() {
        HtmlTreeBuilder builder = new HtmlTreeBuilder();
        assertFalse(builder.resetInsertionMode());
        assertTrue(builder.resetInsertionMode());
    }

}