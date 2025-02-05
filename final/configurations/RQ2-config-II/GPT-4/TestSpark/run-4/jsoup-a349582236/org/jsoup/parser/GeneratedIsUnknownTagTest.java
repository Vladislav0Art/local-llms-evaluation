package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedIsUnknownTagTest {

    @Test
    public void isUnknownTagTest() {
        assertFalse(Tag.isKnownTag("unknownTag"));
    }

}