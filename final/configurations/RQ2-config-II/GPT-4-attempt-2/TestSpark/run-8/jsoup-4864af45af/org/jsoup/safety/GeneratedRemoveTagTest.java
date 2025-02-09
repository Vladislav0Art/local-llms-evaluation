package org.jsoup.safety;

import org.junit.Test;
import org.jsoup.nodes.Attributes;

import static org.junit.Assert.*;

public class GeneratedRemoveTagTest {

    @Test
    public void removeTagTest() {
        Safelist safelist = Safelist.basic();
        assertFalse(safelist.isSafeTag("script"));
        safelist.removeTags("script");
        assertFalse(safelist.isSafeTag("script"));
    }

}