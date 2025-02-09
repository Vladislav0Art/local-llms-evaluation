package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedIsSelfClosing tagWithNoSelfClosingAttribute tagWithoutSelfClosingAttribute_ReturnsFalse {

    @Test
    public void isSelfClosing

    tagWithNoSelfClosingAttribute tagWithoutSelfClosingAttribute_ReturnsFalse() {
        String tagName = "img";
        Tag actualTag = Tag.valueOf(tagName);
        assertFalse(actualTag.isSelfClosing());
    }

}