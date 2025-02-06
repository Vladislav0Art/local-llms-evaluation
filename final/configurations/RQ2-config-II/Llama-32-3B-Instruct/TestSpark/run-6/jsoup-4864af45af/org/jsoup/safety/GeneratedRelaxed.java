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
public class GeneratedRelaxed {

    @Mock
    private Element element;

    @Test
    public void relaxed() {
        // Arrange
        when(element.getTagName()).thenReturn("div");

        // Act
        Set<String> result = new HashSet<>();
        Safelist safelist = Safelist.relaxed();
        result.addAll(safelist.addTags("div"));
        assertEquals(3, result.size());
    }

}