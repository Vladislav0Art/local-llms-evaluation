package org.jsoup.parser;

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
public class GeneratedValueOfTest {

    @Test
    public void valueOfTest() {
        ParseSettings parseSettings = new ParseSettings(true, true);
        Tag tag1 = Tag.valueOf("div", parseSettings);
        assertEquals("div", tag1.getName());
        Tag tag2 = Tag.valueOf("div");
        assertEquals("div", tag2.getName());
    }

}