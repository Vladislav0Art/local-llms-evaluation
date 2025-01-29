package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.safety.Safelist;

import java.util.Set;

public class GeneratedTestBasic {

    @Test
    public void testBasic() {
        Safelist safelist = Safelist.basic();
        assertTrue(safelist.isSafeTag("body"));
        assertTrue(safelist.isSafeAttribute("title", "id", ""));
        assertFalse(safelist.isSafeAttribute("a", "", "href"));
    }

}