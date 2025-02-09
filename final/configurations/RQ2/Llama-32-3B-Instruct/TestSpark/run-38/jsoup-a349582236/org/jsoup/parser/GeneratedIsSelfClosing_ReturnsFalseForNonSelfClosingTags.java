package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedIsSelfClosing_ReturnsFalseForNonSelfClosingTags {

    @Test
    public void isSelfClosing_ReturnsFalseForNonSelfClosingTags() {
        assertFalse(Tag.class.isAssignableFrom(EmptyTag.class));
        EmptyTag emptyTag = (EmptyTag) Tag.valueOf("");
        assertFalse(emptyTag.isSelfClosing());
        assertFalse(Tag.valueOf("img").isSelfClosing());
    }

}