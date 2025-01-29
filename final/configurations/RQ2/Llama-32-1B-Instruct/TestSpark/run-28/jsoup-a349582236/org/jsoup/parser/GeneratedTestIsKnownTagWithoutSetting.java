package org.jsoup.parser;

import org.junit.Before;
import org.junit.Test;

public class GeneratedTestIsKnownTagWithoutSetting {

    private Tag tag;

    @Before
    public void setUp() {
        tag = new Tag();
    }

    @Test
    public void testIsKnownTagWithoutSetting() {
        assertEquals(false, Tag.isKnownTag("input"));
    }

}