package org.jsoup.parser;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedIsSelfClosingNotSelfClosingTagTest {

    @Test
    public void isSelfClosingNotSelfClosingTagTest() {
        Tag tag = Tag.valueOf("p");
        assertFalse(tag.isSelfClosing());
    }

}