package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;
import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedIsKnownTag_[String][Scenario]

Test {

    @Test
    public void isKnownTag_[ String][Scenario]Test() {
        Mockito.when(Tag.isKnownTag(Mockito.anyString())).thenReturn(true);
        assertTrue(Tag.isKnownTag("tagName"));
        Mockito.verifyNoMoreInteractions(Tag.isKnownTag);
    }

}