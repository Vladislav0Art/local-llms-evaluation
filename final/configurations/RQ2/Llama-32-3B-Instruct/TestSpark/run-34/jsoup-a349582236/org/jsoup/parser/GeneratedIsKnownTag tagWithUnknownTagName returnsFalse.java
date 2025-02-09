package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedIsKnownTag tagWithUnknownTagName returnsFalse {

    @Test
    public void isKnownTag

    tagWithUnknownTagName returnsFalse() {
        String tagName = "unknown-tag";
        assertFalse(Tag.isKnownTag(tagName));
    }

}