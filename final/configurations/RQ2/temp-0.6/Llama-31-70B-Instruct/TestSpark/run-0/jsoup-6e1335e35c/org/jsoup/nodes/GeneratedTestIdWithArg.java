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

public class GeneratedTestIdWithArg {

    @Test
    public void testIdWithArg() {
        Element element = mock(Element.class);
        Mockito.when(element.id("id")).thenReturn(element);
        assertNotNull(element.id("id"));
        verify(element, VerificationModeFactory.times(1)).id("id");
    }

}