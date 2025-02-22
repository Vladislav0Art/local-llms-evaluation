package org.jsoup.parser;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedIsKnownTag_returnsFalse_whenTagNameIsUnknown {

    private Tag tag;

    @Before
    public void setUp() {
        tag = new Tag("testTagName");
    }

    @Test
    public void isKnownTag_returnsFalse_whenTagNameIsUnknown() {
        assertEquals(false, Tag.isKnownTag("unknownTagName"));
    }

}