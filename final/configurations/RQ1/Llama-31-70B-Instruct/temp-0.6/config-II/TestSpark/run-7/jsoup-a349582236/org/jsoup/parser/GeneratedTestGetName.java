package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;
import org.jsoup.nodes.Element;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;

import static org.mockito.Mockito.*;

import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTestGetName {

    @Mock
    private Tag mockTag;

    @Before
    public void setup() {
        mockTag = mock(Tag.class);
    }

    @Test
    public void testGetName() {
        String tagName = "tag";
        when(mockTag.getName()).thenReturn(tagName);
        assertEquals(tagName, mockTag.getName());
    }

}