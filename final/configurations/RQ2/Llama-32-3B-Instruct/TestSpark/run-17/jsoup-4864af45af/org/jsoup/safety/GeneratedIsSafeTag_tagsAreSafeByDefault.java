package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.HashSet;

public class GeneratedIsSafeTag_tagsAreSafeByDefault {

    @Test
    public void isSafeTag_tagsAreSafeByDefault() {
        assertTrue(Safelist.basic().isSafeTag("a"));
    }

}