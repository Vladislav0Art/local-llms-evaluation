package org.jsoup.parser;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedPreserveWhitespace_returnsFalse_whenCalled {

    private Tag tag;

    @Before
    public void setUp() {
        tag = new Tag("testTagName");
    }

    @Test
    public void preserveWhitespace_returnsFalse_whenCalled() {
        assertEquals(false, tag.preserveWhitespace());
    }

}