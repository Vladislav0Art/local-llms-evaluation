package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedNormalNameShouldReturnLowercaseTagName {

    @Test
    public void normalNameShouldReturnLowercaseTagName() {
        Tag tag = new Tag("P");
        String actualNormalName = tag.normalName();
        assertEquals("p", actualNormalName);
    }

}