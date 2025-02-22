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
public class GeneratedEqualsTest {

    @Mock
    private Tag tag;

    @Test
    public void equalsTest() {
        Tag tag1 = new Tag("tag1");
        Tag tag2 = new Tag("tag2");
        assertFalse(tag1.equals(tag2));
    }

}