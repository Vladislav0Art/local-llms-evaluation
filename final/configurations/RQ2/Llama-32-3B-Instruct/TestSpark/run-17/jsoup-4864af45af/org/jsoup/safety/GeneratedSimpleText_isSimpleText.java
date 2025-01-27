package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.HashSet;

public class GeneratedSimpleText_isSimpleText {

    @Test
    public void simpleText_isSimpleText() {
        Safelist safelist = Safelist.simpleText();
        assertNotNull(safelist);
        assertEquals(Safelist.simpleText(), safelist);
    }

}