package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.util.HashMap;
import java.util.Map;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedGetName_ReturnsTagNameTest {

    @Test
    public void getName_ReturnsTagNameTest() {
        Tag tag = new Tag("div");
        assertEquals("div", tag.getName());
    }

}