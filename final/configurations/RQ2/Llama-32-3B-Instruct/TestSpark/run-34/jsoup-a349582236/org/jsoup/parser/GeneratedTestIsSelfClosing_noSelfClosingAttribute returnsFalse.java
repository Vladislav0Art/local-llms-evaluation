package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedTestIsSelfClosing_noSelfClosingAttribute returnsFalse {

    @Test
    public void testIsSelfClosing_noSelfClosingAttribute

    returnsFalse() {
        String tagName = "img";
        Tag actualTag = Tag.valueOf(tagName);
        assertFalse(actualTag.isSelfClosing());
    }

}