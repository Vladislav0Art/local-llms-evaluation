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
public class GeneratedTest {

    @Mock
    private Element element;

    @Test
    public void none() {
        // Arrange
        when(element.getTagName()).thenReturn("a");

        // Act
        Set<String> result = new HashSet<>();
        Safelist safelist = Safelist.none();
        result.addAll(safelist.addTags("a"));
        assertEquals(0, result.size());
    }

    @Test
    public void simpleText() {
        // Arrange
        when(element.getTagName()).thenReturn("span");

        // Act
        Set<String> result = new HashSet<>();
        Safelist safelist = Safelist.simpleText();
        result.addAll(safelist.addTags("span"));
        assertEquals(1, result.size());
    }

    @Test
    public void basic() {
        // Arrange
        when(element.getTagName()).thenReturn("img");

        // Act
        Set<String> result = new HashSet<>();
        Safelist safelist = Safelist.basic();
        result.addAll(safelist.addTags("img"));
        assertEquals(1, result.size());
    }

    @Test
    public void basicWithImages() {
        // Arrange
        when(element.getTagName()).thenReturn("b");

        // Act
        Set<String> result = new HashSet<>();
        Safelist safelist = Safelist.basic();
        result.addAll(safelist.addTags("img"));
        assertEquals(2, result.size());
    }

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

    @Test
    public void addProtocols() {
        // Arrange
        when(element.getTagName()).thenReturn("link");

        // Act
        Set<String> result = new HashSet<>();
        Safelist safelist = Safelist.addProtocols(Safelist.relaxed(), "rel");
        result.addAll(safelist.addTags("link"));
        assertEquals(1, result.size());
    }

    @Test
    public void removeProtocols() {
        // Arrange
        when(element.getTagName()).thenReturn("meta");

        // Act
        Set<String> result = new HashSet<>();
        Safelist safelist = Safelist.removeProtocols(Safelist.relaxed(), "rel");
        result.addAll(safelist.addTags("meta"));
        assertEquals(0, result.size());
    }

    @Test
    public void isSafeTag() {
        // Arrange

        // Act
        assertTrue(Safelist.isSafeTag("img"));
    }

    @Test
    public void isSafeAttribute() {
        // Arrange
        when(element.getTagName()).thenReturn("a");
        when(element.getAttributeName()).thenReturn("href");

        // Act
        assertTrue(Safelist.isSafeAttribute("a", element, new Attribute()));
    }

    @Test
    public void getEnforcedAttributes() {
        // Arrange
        when(element.getTagName()).thenReturn("span");

        // Act
        Set<String> result = Safelist.getEnforcedAttributes("span");
        assertEquals(1, result.size());
    }

}