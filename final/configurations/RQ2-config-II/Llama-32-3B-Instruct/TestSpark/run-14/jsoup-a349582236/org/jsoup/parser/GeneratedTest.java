package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Mock
    private ParseSettings parseSettings;

    public TagTest() {
        when(parseSettings.getNamespace()).thenReturn("http://www.w3.org/1999/xhtml");
    }

    @Test
    public void testGetNameReturnsName() {
        String name = "div";
        when(parseSettings.getNamespace()).thenReturn(name);
        Tag tag = Tag.valueOf(name, parseSettings);
        assertEquals(name, tag.getName());
    }

    @Test
    public void testNormalNameReturnsNormalizedName() {
        String name = " span ";
        when(parseSettings.getNamespace()).thenReturn("http://www.w3.org/1999/xhtml");
        Tag tag = Tag.valueOf(name, parseSettings);
        assertEquals("span", Normalizer.normalise(tag.normalName()));
    }

    @Test
    public void testIsBlockReturnsTrueForBlockTags() {
        String name = "div";
        when(parseSettings.getNamespace()).thenReturn(name);
        Tag tag = Tag.valueOf(name, parseSettings);
        assertTrue(tag.isBlock());
    }

    @Test
    public void testIsBlockReturnsFalseForInlineTags() {
        String name = "span";
        when(parseSettings.getNamespace()).thenReturn(name);
        Tag tag = Tag.valueOf(name, parseSettings);
        assertFalse(tag.isBlock());
    }

    @Test
    public void testFormatAsBlockDoesNotChangeTagType() {
        String name = "div";
        when(parseSettings.getNamespace()).thenReturn(name);
        Tag tag = Tag.valueOf(name, parseSettings);
        assertFalse(tag.formatAsBlock());
    }

    @Test
    public void testIsSelfClosingReturnsFalseForNonSelfClosingTags() {
        String name = "span";
        when(parseSettings.getNamespace()).thenReturn(name);
        Tag tag = Tag.valueOf(name, parseSettings);
        assertFalse(tag.isSelfClosing());
    }

    @Test
    public void testIsKnownTagReturnsTrueForKnownTags() {
        String[] knownTags = {"div", "p"};
        for (String tag : knownTags) {
            when(parseSettings.getNamespace()).thenReturn("http://www.w3.org/1999/xhtml");
            Tag tagInstance = Tag.valueOf(tag, parseSettings);
            assertTrue(Tag.isKnownTag(tag));
        }
    }

    @Test
    public void testIsFormListedReturnsTrueForFormTags() {
        String name = "input";
        when(parseSettings.getNamespace()).thenReturn(name);
        Tag tag = Tag.valueOf(name, parseSettings);
        assertTrue(tag.isFormListed());
    }

    @Test
    public void testIsFormSubmittableReturnsFalseForNonFormTags() {
        String name = "span";
        when(parseSettings.getNamespace()).thenReturn(name);
        Tag tag = Tag.valueOf(name, parseSettings);
        assertFalse(tag.isFormSubmittable());
    }

}