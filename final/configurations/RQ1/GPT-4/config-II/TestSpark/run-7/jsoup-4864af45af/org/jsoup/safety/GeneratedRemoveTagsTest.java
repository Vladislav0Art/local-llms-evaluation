package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.jsoup.safety.Safelist;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedRemoveTagsTest {

    @Test
    public void removeTagsTest() {
        Safelist safelist = Safelist.simpleText();
        assertTrue(safelist.isSafeTag("b"));
        safelist.removeTags("b");
        assertFalse(safelist.isSafeTag("b"));
    }

}