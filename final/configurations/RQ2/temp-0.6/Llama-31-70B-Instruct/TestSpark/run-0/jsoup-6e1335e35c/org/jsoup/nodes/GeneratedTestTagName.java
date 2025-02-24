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

public class GeneratedTestTagName {

    @Test
    public void testTagName() {
        Element element = mock(Element.class);
        Mockito.when(element.tagName()).thenReturn("tagName");
        assertEquals("tagName", element.tagName());
    }

}