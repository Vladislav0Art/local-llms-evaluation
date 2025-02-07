package org.jsoup.safety;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashSet;

public class GeneratedTest {

    @Test
    public void none_SimpleText_PreserveRelativeLinks() {
        Safelist none = new SafeList();
        assertTrue(none.preserveRelativeLinks(true));
    }

    @Test
    public void none_SimpleText_NoTags() {
        Safelist none = new SafeList();
        assertNotNull(none.getEnforcedAttributes("test"));
    }

    @Test
    public void none_Relaxed_Basic() {
        Safelist none = new SafeList();
        assertNull(none.addTags("a", "b"));
    }

    @Test
    public void none_Relaxed_Basic_Copies() {
        Safelist copy = Safelist.none().copy();
        assertNotNull(copy.getEnforcedAttributes("test"));
    }

    @Test
    public void none_SimpleText_NoAttribute() {
        Safelist none = new SafeList();
        assertNull(none.addAttributes(""));
    }

    @Test
    public void simpleText_Basic() {
        Safelist safelist = Safelist.simpleText();
        assertTrue(safelist.isSafeTag("a"));
        assertTrue(safelist.isSafeAttribute("test", null, null));
        assertFalse(safelist.getEnforcedAttributes("test"));
    }

    @Test
    public void simpleText_Relaxed() {
        Safelist safelist = Safelist.relativelyUnsafe();
        assertTrue(safelist.isSafeTag("a"));
        assertTrue(safelist.isSafeAttribute("test", null, null));
        assertFalse(safelist.getEnforcedAttributes("test"));
    }

    @Test
    public void simpleText_Relaxed_Basic() {
        Safelist safelist = Safelist.relativelyUnsafe().copy();
        assertNotNull(safelist.addTags("a", "b"));
    }

    @Test
    public void basic_PreserveRelativeLinks() {
        Safelist none = new SafeList();
        assertTrue(none.preserveRelativeLinks(true));
    }

    @Test
    public void basic_Relaxed_Basic() {
        Safelist safelist = Safelist.basic();
        assertNull(safelist.addTags("a", "b"));
    }

    @Test
    public void basic_Relaxed_Copies() {
        Safelist copy = Safelist.basic().copy();
        assertNotNull(copy.getEnforcedAttributes("test"));
    }

    @Test
    public void basic_SimpleText_PreserveRelativeLinks() {
        Safelist safelist = Safelist.basic();
        assertTrue(safelist.preserveRelativeLinks(true));
    }

    @Test
    public void basic_Relaxed_Basic() {
        Safelist safelist = Safelist.basic().copy();
        assertNotNull(safelist.addTags("a", "b"));
    }

    @Test
    public void basic_Relaxed_Copies() {
        Safelist copy = Safelist.basic().copy();
        assertNotNull(copy.getEnforcedAttributes("test"));
    }

    @Test
    public void basic_SimpleText_NoAttribute() {
        Safelist safelist = Safelist.basic();
        assertNull(safelist.addAttributes(""));
    }

    @Test
    public void basic_Relaxed_Basic() {
        Safelist safelist = Safelist.basic().copy();
        assertNotNull(safelist.getEnforcedAttributes("test"));
    }

    @Test
    public void basic_SimpleText_NoTags() {
        Safelist safelist = Safelist.basic();
        assertTrue(safelist.addTags("a", "b"));
    }

    @Test
    public void basic_Relaxed_Basic() {
        Safelist safelist = Safelist.basic().copy();
        assertNotNull(safelist.addTags("a", "b"));
    }

    @Test
    public void basic_SimpleText_NoTags_Copies() {
        Safelist copy = Safelist.basic().copy();
        assertNotNull(copy.getEnforcedAttributes("test"));
    }

    @Test
    public void basic_Relaxed_Basic_Copies() {
        Safelist safelist = Safelist.basic().copy();
        assertNull(safelist.removeTags(""));
    }

    @Test
    public void basic_Relaxed_SimpleText_PreserveRelativeLinks() {
        Safelist safelist = Safelist.basic();
        assertTrue(safelist.preserveRelativeLinks(true));
    }

    @Test
    public void basic_Relaxed_Basic_Copies() {
        Safelist copy = Safelist.basic().copy();
        assertNotNull(copy.getEnforcedAttributes("test"));
    }

}