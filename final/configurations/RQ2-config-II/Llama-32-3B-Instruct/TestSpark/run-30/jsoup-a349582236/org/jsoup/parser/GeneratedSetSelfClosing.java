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
public class GeneratedSetSelfClosing {

    @Mock
    private ParseSettings settings;

    @InjectMocks
    private Tag tag;

    @Test
    public void setSelfClosing() {
        Tag selfClosing = new Tag();
        when(settings.getSelfClosingName()).thenReturn("selfClosing");
        Tag actualResultTag = Tag.valueOf("selfClosing", settings);
        assertEquals(selfClosing, actualResultTag);
        tag.setSelfClosing();
        assertTrue(tag.isSelfClosing());
    }

}