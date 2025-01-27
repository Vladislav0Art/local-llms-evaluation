package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.HashSet;

public class GeneratedNone_isNone {

    @Test
    public void none_isNone() {
        Safelist safelist = Safelist.none();
        assertNotNull(safelist);
        assertEquals(Safelist.none(), safelist);
    }

}