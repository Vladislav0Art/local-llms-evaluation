package org.jsoup.parser;

import org.jsoup.parser.ParseSettings;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedGetNormalName_InvalidTagName_ReturnsEmptyString {

    @Test
    public void getNormalName_InvalidTagName_ReturnsEmptyString() {
        String invalidTagName = "invalid";
        Tag tag = new Tag();
        assertEquals(Validate.unsafeChar(invalidTagName), tag.normalName());
    }

}