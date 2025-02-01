package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedRemoveTagsTest {

    @Test
    public void removeTagsTest() {
        Safelist safelist = Safelist.relaxed().removeTags("div");

        assertFalse(safelist.isSafeTag("div"));
        assertTrue(safelist.isSafeTag("p"));
    }

}