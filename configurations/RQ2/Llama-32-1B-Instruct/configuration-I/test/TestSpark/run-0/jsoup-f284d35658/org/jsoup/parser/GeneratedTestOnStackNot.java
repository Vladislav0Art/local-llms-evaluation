package org.jsoup.parser;

import org.jsoup.parser.HtmlTreeBuilder;
import org.junit.jupiter.api.Test;

public class GeneratedTestOnStackNot {

    @Test
    public void testOnStackNot() {
        HtmlTreeBuilder builder = new HtmlTreeBuilder();
        assertTrue(builder.onStackNot(new String[]{"img"}));
    }

}