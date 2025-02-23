package org.jsoup.parser;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Before
    public void setUp() {
        // No setup required
    }

    @Test
    public void getTagName_should_return_the_tag_name() {
        Tag tag = new Tag("div");
        assertEquals("div", tag.getName());
    }

    @Test
    public void getTagName_should_return_the_normalized_tag_name() {
        Tag tag = new Tag("DIV");
        assertEquals("div", tag.getName());
    }

    @Test
    public void isBlock_should_return_true_if_the_tag_is_a_block() {
        Tag tag = new Tag("div");
        assertTrue(tag.isBlock());
    }

    @Test
    public void isBlock_should_return_false_if_the_tag_is_not_a_block() {
        Tag tag = new Tag("span");
        assertFalse(tag.isBlock());
    }

    @Test
    public void formatAsBlock_should_return_true_if_the_tag_should_be_formatted_as_a_block() {
        Tag tag = new Tag("div");
        assertTrue(tag.formatAsBlock());
    }

    @Test
    public void formatAsBlock_should_return_false_if_the_tag_should_not_be_formatted_as_a_block() {
        Tag tag = new Tag("span");
        assertFalse(tag.formatAsBlock());
    }

    @Test
    public void isEmpty_should_return_true_if_the_tag_is_empty() {
        Tag tag = new Tag("br");
        assertTrue(tag.isEmpty());
    }

}