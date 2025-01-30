package org.jsoup.safety;

import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.jsoup.safety.Safelist;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedRemoveTagsTest {

    @Test
    public void removeTagsTest() {
        Safelist safelist = Safelist.relaxed();
        safelist.removeTags("blockquote", "code", "dd", "div");
        assertFalse(safelist.isSafeTag("blockquote"));
        assertFalse(safelist.isSafeTag("code"));
        assertFalse(safelist.isSafeTag("dd"));
        assertFalse(safelist.isSafeTag("div"));
    }

}