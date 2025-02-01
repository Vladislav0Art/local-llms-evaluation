package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.jsoup.safety.Safelist;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class GeneratedRemoveTagsValidatingTest {

    @Test
    public void removeTagsValidatingTest() {
        Safelist safelist = new Safelist();
        safelist.addTags("p", "br");
        safelist.removeTags("p");
        assertFalse(safelist.isSafeTag("p"));
        assertTrue(safelist.isSafeTag("br"));
    }

}