package org.jsoup.parser;

import org.jsoup.parser.Parser;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class GeneratedTestSetSelfClosing {

    @Test
    public void testSetSelfClosing() {
        Parser parser = Mockito.mock(Parser.class);
        Tag tag = new Tag();
        tag.setSelfClosing(true);
        assertTrue(tag.isSelfClosing());
    }

}