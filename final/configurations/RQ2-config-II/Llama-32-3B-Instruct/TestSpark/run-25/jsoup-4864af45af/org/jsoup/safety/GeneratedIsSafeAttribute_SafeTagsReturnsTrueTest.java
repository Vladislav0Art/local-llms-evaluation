package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Set;
import java.util.HashSet;

public class GeneratedIsSafeAttribute_SafeTagsReturnsTrueTest {

    @Test
    public void isSafeAttribute_SafeTagsReturnsTrueTest() {
        Safelist safelist = Safelist.relaxed();
        assertFalse(safelist.isSafeAttribute("script", new Element(), new Attribute()));
    }

}