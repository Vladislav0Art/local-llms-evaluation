package org.jsoup.parser;

import org.jsoup.parser.Tag;
import org.junit.Test;

public class GeneratedTestValueOfUnknownTag {

    @Test
    public void testValueOfUnknownTag() {
        String tagName = TAG_NAME;
        expectedValues.put(tagName, "test-value");
        Tag tag = new Tag();
        tag.setValue("test-value");
        Tag value = Tag.valueOf(tagName);
        when(value.parseTagName()).thenReturn(tagName);
        assertEquals(expectedValues, value.getParseTagName());
    }

}