package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.jsoup.safety.Safelist;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class GeneratedRemoveTagsTest {

    @Test
    public void removeTagsTest() {
        Safelist safelist = Safelist.relaxed();
        safelist.removeTags("p", "br");
        assertTrue(!safelist.isSafeTag("p"));
        assertTrue(!safelist.isSafeTag("br"));
    }

}