package org.jsoup.parser;

import org.junit.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

public class GeneratedTest {

    @Test
    public void cloneMethodShouldCloneObject() {
        Tag tag = new Tag("tag");
        Tag tagClone = tag.clone();

        assertThat(tagClone, is(not(sameInstance(tag))));
    }

    @Test
    public void equalsMethodShouldReturnTrueForEqualObjects() {
        Tag tag1 = new Tag("tag");
        Tag tag2 = new Tag("tag");

        assertTrue(tag1.equals(tag2));
    }

    @Test
    public void equalsMethodShouldReturnFalseForUnequalObjects() {
        Tag tag1 = new Tag("tag1");
        Tag tag2 = new Tag("tag2");

        assertFalse(tag1.equals(tag2));
    }

    @Test
    public void hashCodeMethodShouldReturnSameHashCodeForEqualObjects() {
        Tag tag1 = new Tag("tag");
        Tag tag2 = new Tag("tag");

        assertEquals(tag1.hashCode(), tag2.hashCode());
    }

    @Test
    public void isBlockMethodShouldReturnTrueWhenIsBlockIsTrue() {
        Tag tag = new Tag("tag");
        tag.isBlock = true;

        assertTrue(tag.isBlock());
    }

}