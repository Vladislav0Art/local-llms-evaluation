package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;
import org.jsoup.nodes.Tag;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.Mockito;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTestFormatAsBlock {

    @Mock
    Tag tag;

    @Before
    public void setUp() {
        tag = Mockito.mock(Tag.class);
    }

    @Test
    public void testFormatAsBlock() {
        when(tag.formatAsBlock()).thenReturn(true);
        assertTrue(tag.formatAsBlock());
    }

}