package org.jsoup.parser;

import org.jsoup.parser.HtmlTreeBuilder;
import org.junit.jupiter.api.Test;

public class GeneratedTestMaybeSetBaseUri {

    @Test
    public void testMaybeSetBaseUri() {
        HtmlTreeBuilder builder = new HtmlTreeBuilder();
        Element base = new Element("base");
        builder.maybeSetBaseUri(base);
        assertTrue(builder.state().isFosterInserts());
    }

}