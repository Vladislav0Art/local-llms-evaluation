package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedGetName_ReturnsTagName_ReturnsTagName {

    @Test
    public void getName_ReturnsTagName_ReturnsTagName() {
        Tag tag = new Tag("div");
        assertEquals("div", tag.getName());
    }

}