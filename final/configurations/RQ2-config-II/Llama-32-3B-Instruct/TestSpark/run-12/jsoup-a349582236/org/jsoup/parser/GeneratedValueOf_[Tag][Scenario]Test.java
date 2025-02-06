package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;
import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedValueOf_[Tag][Scenario]

Test {

    @Test
    public void valueOf_[ Tag][Scenario]Test() {
        Mockito.when(Tag.valueOf(Mockito.anyString(), Mockito.any(Object.class))).thenReturn(new Tag());
        assertEquals(new Tag(), Tag.valueOf("tagName", null));
        Mockito.verifyNoMoreInteractions(Tag.valueOf);
    }

}