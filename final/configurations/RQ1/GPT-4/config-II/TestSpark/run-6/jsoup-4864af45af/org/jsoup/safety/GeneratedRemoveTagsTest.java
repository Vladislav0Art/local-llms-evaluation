package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Attributes;
import org.junit.Test;

import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

public class GeneratedRemoveTagsTest {

    @Test
    public void removeTagsTest() {
        Safelist safelist = Safelist.simpleText();
        safelist.removeTags("b", "i");

        assertFalse(safelist.isSafeTag("b"));
        assertFalse(safelist.isSafeTag("i"));
        assertTrue(safelist.isSafeTag("u"));
    }

}