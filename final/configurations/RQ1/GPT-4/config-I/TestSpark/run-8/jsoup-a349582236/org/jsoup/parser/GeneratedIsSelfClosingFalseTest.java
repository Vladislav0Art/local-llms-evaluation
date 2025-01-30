package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.parser.*;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedIsSelfClosingFalseTest {

    private ParseSettings defaultSettings = ParseSettings.preserveCase;

    @Test
    public void isSelfClosingFalseTest() {
        Tag tag = Tag.valueOf("div");
        assertFalse(tag.isSelfClosing());
    }

}