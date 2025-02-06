package org.jsoup.safety;

import org.jsoup.safety.Safelist;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.Set;

public class GeneratedSimpleText_onlyContainsTextTags {

    @Test
    public void simpleText_onlyContainsTextTags() {
        Safelist list = Safelist.simpleText();
        assertTrue(list.isSafeTag("p"));
        assertTrue(list.isSafeTag("span"));
        assertFalse(list.isSafeTag("img"));
    }

}