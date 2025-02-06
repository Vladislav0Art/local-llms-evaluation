package org.jsoup.parser;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedIsEmpty {

    @Mock
    private ParseSettings settings;

    @InjectMocks
    private Tag tag;

    @Test
    public void isEmpty() {
        Tag emptyTag = new Tag();
        when(settings.getEmptyName()).thenReturn("");
        Tag actualResultTag = Tag.valueOf("", settings);
        assertEquals(emptyTag, actualResultTag);
        assertTrue(tag.isEmpty());
    }

}