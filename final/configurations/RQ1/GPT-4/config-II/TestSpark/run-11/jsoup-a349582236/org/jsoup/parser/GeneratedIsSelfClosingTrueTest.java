package org.jsoup.parser;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedIsSelfClosingTrueTest {

    @Test
    public void isSelfClosingTrueTest() {
        Tag tag = Tag.valueOf("area");
        assertTrue(tag.isSelfClosing());
    }

}