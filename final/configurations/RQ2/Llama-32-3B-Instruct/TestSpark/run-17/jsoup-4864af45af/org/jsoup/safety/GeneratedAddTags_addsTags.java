package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.HashSet;

public class GeneratedAddTags_addsTags {

    @Test
    public void addTags_addsTags() {
        Safelist safelist = Safelist.none().addTags("a", "b");
        assertNotNull(safelist);
        assertTrue(safelist.isSafeTag("a") && safelist.isSafeTag("b"));
    }

}