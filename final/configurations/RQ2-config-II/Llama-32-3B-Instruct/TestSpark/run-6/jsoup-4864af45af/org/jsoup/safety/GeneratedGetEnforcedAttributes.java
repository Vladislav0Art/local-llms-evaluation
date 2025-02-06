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
public class GeneratedGetEnforcedAttributes {

    @Mock
    private Element element;

    @Test
    public void getEnforcedAttributes() {
        // Arrange
        when(element.getTagName()).thenReturn("span");

        // Act
        Set<String> result = Safelist.getEnforcedAttributes("span");
        assertEquals(1, result.size());
    }

}