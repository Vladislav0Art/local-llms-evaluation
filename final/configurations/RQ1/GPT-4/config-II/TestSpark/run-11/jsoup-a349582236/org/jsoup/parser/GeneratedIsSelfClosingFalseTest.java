package org.jsoup.parser;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedIsSelfClosingFalseTest {

    @Test
    public void isSelfClosingFalseTest() {
        Tag tag = Tag.valueOf("div");
        assertFalse(tag.isSelfClosing());
    }

}