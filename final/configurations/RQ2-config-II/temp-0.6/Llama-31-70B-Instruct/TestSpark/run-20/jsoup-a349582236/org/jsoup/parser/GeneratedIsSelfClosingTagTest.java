package org.jsoup.parser;

import org.jsoup.parser.Tag;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedIsSelfClosingTagTest {

    @Test
    public void isSelfClosingTagTest() {
        Tag tag = new Tag("div");
        assertFalse(tag.isSelfClosing());
    }

}