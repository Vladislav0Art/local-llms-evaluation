package org.jsoup.parser;

import org.jsoup.parser.Tag;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedSetSelfClosing_AlwaysSetsSelfClosing {

    @Test
    public void setSelfClosing_AlwaysSetsSelfClosing() {
        Tag tag1 = new Tag();
        tag1.setSelfClosing();
        assertTrue(tag1.isSelfClosing());
    }

}