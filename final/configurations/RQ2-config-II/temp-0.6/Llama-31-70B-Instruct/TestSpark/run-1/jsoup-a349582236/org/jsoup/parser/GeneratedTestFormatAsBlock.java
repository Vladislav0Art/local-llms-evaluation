package org.jsoup.parser;

import org.jsoup.helper.Normalizer;
import org.jsoup.helper.Validate;
import org.jsoup.nodes.Element;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTestFormatAsBlock {

    private static final Map<String, Tag> tags = new HashMap<>();

    @Mock
    private Element element;

    @Test
    public void testFormatAsBlock() {
        assertTrue(Tag.valueOf("div").formatAsBlock());
        assertFalse(Tag.valueOf("span").formatAsBlock());
    }

}