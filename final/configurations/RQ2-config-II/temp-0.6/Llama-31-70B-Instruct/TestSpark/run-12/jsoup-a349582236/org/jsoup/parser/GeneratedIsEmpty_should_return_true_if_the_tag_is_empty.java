package org.jsoup.parser;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedIsEmpty_should_return_true_if_the_tag_is_empty {

    @Before
    public void setUp() {
        // No setup required
    }

    @Test
    public void isEmpty_should_return_true_if_the_tag_is_empty() {
        Tag tag = new Tag("br");
        assertTrue(tag.isEmpty());
    }

}