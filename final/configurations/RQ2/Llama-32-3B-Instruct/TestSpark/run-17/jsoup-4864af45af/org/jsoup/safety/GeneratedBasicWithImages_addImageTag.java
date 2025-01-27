package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.HashSet;

public class GeneratedBasicWithImages_addImageTag {

    @Test
    public void basicWithImages_addImageTag() {
        Safelist safelist = Safelist.basic().addTags("img");
        assertNotNull(safelist);
        assertTrue(safelist.isSafeTag("img"));
    }

}