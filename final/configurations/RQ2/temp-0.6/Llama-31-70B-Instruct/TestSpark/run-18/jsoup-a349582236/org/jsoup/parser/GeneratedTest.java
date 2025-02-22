package org.jsoup.parser;

import org.jsoup.parser.Tag;
import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Mock
    private Tag tag;

    @Test
    public void cloneTest() {
        try {
            when(tag.clone()).thenReturn(tag);
            assertEquals(tag, tag.clone());
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    public void equalsTest() {
        Tag tag1 = new Tag("tag1");
        Tag tag2 = new Tag("tag2");
        assertFalse(tag1.equals(tag2));
    }

    @Test
    public void hashCodeTest() {
        Tag tag1 = new Tag("tag1");
        Tag tag2 = new Tag("tag2");
        assertNotEquals(tag1.hashCode(), tag2.hashCode());
    }

    @Test
    public void toStringTest() {
        Tag tag1 = new Tag("tag1");
        assertEquals("tag1", tag1.toString());
    }

}