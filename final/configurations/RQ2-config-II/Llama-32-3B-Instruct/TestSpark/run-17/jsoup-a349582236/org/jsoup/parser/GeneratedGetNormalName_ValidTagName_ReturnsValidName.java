package org.jsoup.parser;

import org.jsoup.parser.ParseSettings;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedGetNormalName_ValidTagName_ReturnsValidName {

    @Test
    public void getNormalName_ValidTagName_ReturnsValidName() {
        String validTagName = "<div>";
        Tag tag = new Tag();
        assertEquals(validTagName, tag.normalName());
    }

}