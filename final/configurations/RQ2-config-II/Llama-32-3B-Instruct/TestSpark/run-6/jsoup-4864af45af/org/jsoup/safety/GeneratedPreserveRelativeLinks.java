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
public class GeneratedPreserveRelativeLinks {

    @Mock
    private Element element;

    @Test
    public void preserveRelativeLinks() {
        // Arrange
        when(element.getTagName()).thenReturn("script");

        // Act
        Set<String> result = new HashSet<>();
        Safelist safelist = Safelist.preserveRelativeLinks(true);
        result.addAll(safelist.addTags("script"));
        assertTrue(result.contains("javascript"));
    }

}