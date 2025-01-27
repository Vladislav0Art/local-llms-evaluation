package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.HashSet;

public class GeneratedRelaxed_addRelaxedTag {

    @Test
    public void relaxed_addRelaxedTag() {
        Safelist safelist = Safelist.relaxed();
        assertNotNull(safelist);
        assertTrue(safelist.isSafeTag("rel"));
    }

}