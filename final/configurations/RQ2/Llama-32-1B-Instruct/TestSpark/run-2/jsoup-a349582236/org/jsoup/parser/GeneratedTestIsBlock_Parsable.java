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

public class GeneratedTestIsBlock_Parsable {

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
    public void testIsBlock_Parsable() {
        Map<String, Object> map = new HashMap<>();
        when(parseSettings.isBlock(anyString())).thenReturn(map);

        Tag tagValue = new Tag("tagName");
        tagValue.setBlock(true);

        boolean actualIsBlock = tag.getBlock();
        assertNotNull(actualIsBlock);
        assertEquals(true, actualIsBlock);
    }

}