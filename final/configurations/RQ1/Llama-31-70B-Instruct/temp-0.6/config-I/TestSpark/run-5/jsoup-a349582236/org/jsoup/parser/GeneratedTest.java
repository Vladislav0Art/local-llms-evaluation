package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;
import org.jsoup.nodes.Tag;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.Mockito;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Mock
    Tag tag;

    @Before
    public void setUp() {
        tag = Mockito.mock(Tag.class);
    }

    @Test
    public void testGetName() {
        when(tag.getName()).thenReturn("p");
        assertEquals("p", tag.getName());
    }

    @Test
    public void testNormalName() {
        when(tag.normalName()).thenReturn("p");
        assertEquals("p", tag.normalName());
    }

    @Test
    public void testIsBlock() {
        when(tag.isBlock()).thenReturn(false);
        assertFalse(tag.isBlock());
    }

    @Test
    public void testFormatAsBlock() {
        when(tag.formatAsBlock()).thenReturn(true);
        assertTrue(tag.formatAsBlock());
    }

    @Test
    public void testIsEmpty() {
        when(tag.isEmpty()).thenReturn(false);
        assertFalse(tag.isEmpty());
    }

    @Test
    public void testIsSelfClosing() {
        when(tag.isSelfClosing()).thenReturn(false);
        assertFalse(tag.isSelfClosing());
    }

}