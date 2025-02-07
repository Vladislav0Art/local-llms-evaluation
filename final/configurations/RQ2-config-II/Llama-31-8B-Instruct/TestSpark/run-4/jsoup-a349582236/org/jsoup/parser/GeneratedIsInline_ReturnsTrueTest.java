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
public class GeneratedIsInline_ReturnsTrueTest {

    @Test
    public void isInline_ReturnsTrueTest() {
        Tag tag = new Tag("span");
        assertTrue(tag.isInline());
    }

}