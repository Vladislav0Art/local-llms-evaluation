package org.jsoup.parser;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedIsBlock_should_return_true_if_the_tag_is_a_block {

    @Before
    public void setUp() {
        // No setup required
    }

    @Test
    public void isBlock_should_return_true_if_the_tag_is_a_block() {
        Tag tag = new Tag("div");
        assertTrue(tag.isBlock());
    }

}