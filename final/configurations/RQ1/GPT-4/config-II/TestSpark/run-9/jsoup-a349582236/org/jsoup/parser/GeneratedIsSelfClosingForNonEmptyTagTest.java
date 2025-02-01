package org.jsoup.parser;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedIsSelfClosingForNonEmptyTagTest {

    @Test
    public void isSelfClosingForNonEmptyTagTest() {
        Tag tag = Tag.valueOf("body");
        assertFalse(tag.isSelfClosing());
    }

}