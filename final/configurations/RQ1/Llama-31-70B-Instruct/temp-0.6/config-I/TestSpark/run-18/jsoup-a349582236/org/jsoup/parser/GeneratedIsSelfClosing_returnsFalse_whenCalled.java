package org.jsoup.parser;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedIsSelfClosing_returnsFalse_whenCalled {

    private Tag tag;

    @Before
    public void setUp() {
        tag = new Tag("testTagName");
    }

    @Test
    public void isSelfClosing_returnsFalse_whenCalled() {
        assertEquals(false, tag.isSelfClosing());
    }

}