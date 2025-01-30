package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.parser.*;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedIsSelfClosingTrueTest {

    private ParseSettings defaultSettings = ParseSettings.preserveCase;

    @Test
    public void isSelfClosingTrueTest() {
        Tag tag = Tag.valueOf("img");
        assertTrue(tag.isSelfClosing());
    }

}