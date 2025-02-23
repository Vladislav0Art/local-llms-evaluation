package org.jsoup.parser;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedGetTagName_should_return_the_tag_name {

    @Before
    public void setUp() {
        // No setup required
    }

    @Test
    public void getTagName_should_return_the_tag_name() {
        Tag tag = new Tag("div");
        assertEquals("div", tag.getName());
    }

}