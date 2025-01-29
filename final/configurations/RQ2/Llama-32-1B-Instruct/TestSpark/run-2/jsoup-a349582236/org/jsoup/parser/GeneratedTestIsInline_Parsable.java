package org.jsoup.parser;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;

public class GeneratedTestIsInline_Parsable {

    @Mock
    private Normalizer normalizer;

    @Mock
    private ParseSettings parseSettings;

    @InjectMocks
    private Tag tag;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @After
    public void tearDown() {
        MockitoAnnotations.cleanupMocks();
    }

    @Test
    public void testIsInline_Parsable() {
        Map<String, Object> map = new HashMap<>();
        when(parseSettings.isInline(anyString())).thenReturn(map);

        Tag tagValue = new Tag("tagName");
        tagValue.setInline(false);

        boolean actualIsInline = tag.isInline();
        assertNotNull(actualIsInline);
        assertEquals(false, actualIsInline);
    }

}