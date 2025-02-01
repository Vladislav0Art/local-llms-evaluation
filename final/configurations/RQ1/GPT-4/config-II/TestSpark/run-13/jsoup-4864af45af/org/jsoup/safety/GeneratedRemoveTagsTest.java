package org.jsoup.safety;

import org.junit.Test;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.jsoup.safety.Safelist;

import static org.junit.Assert.*;

public class GeneratedRemoveTagsTest {

    @Test
    public void removeTagsTest() {
        Safelist safelist = Safelist.none();
        safelist.addTags("p", "br");
        safelist.removeTags("br");
        assertTrue(safelist.isSafeTag("p"));
        assertFalse(safelist.isSafeTag("br"));
    }

}