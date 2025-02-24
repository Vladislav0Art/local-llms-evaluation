package org.jsoup.nodes;

import org.jsoup.nodes.Element;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.mockito.internal.verification.VerificationModeFactory;
import org.mockito.stubbing.Answer;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class GeneratedTest {

    @Test
    public void testId() {
        Element element = mock(Element.class);
        Mockito.when(element.id()).thenReturn("id");
        assertEquals("id", element.id());
    }

    @Test
    public void testIdWithNull() {
        Element element = mock(Element.class);
        Mockito.when(element.id()).thenReturn(null);
        assertEquals(null, element.id());
    }

    @Test
    public void testIdWithArg() {
        Element element = mock(Element.class);
        Mockito.when(element.id("id")).thenReturn(element);
        assertNotNull(element.id("id"));
        verify(element, VerificationModeFactory.times(1)).id("id");
    }

    @Test
    public void testTagName() {
        Element element = mock(Element.class);
        Mockito.when(element.tagName()).thenReturn("tagName");
        assertEquals("tagName", element.tagName());
    }

    @Test
    public void testTagNameWithNull() {
        Element element = mock(Element.class);
        Mockito.when(element.tagName()).thenReturn(null);
        assertEquals(null, element.tagName());
    }

}