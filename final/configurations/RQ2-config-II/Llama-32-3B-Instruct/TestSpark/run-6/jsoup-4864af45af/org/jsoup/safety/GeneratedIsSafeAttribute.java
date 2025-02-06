package org.jsoup.safety;

import org.jsoup.safety.Safelist;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedIsSafeAttribute {

    @Mock
    private Element element;

    @Test
    public void isSafeAttribute() {
        // Arrange
        when(element.getTagName()).thenReturn("a");
        when(element.getAttributeName()).thenReturn("href");

        // Act
        assertTrue(Safelist.isSafeAttribute("a", element, new Attribute()));
    }

}