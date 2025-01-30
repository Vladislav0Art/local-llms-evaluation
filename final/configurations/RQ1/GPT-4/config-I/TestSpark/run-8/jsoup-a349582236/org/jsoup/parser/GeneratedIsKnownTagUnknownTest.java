package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.parser.*;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedIsKnownTagUnknownTest {

    private ParseSettings defaultSettings = ParseSettings.preserveCase;

    @Test
    public void isKnownTagUnknownTest() {
        assertFalse(Tag.isKnownTag("fake"));
    }

}