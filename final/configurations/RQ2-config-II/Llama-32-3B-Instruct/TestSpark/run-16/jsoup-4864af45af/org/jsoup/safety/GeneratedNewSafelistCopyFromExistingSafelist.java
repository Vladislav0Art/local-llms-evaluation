package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Element;

public class GeneratedNewSafelistCopyFromExistingSafelist {

    @Test
    public void newSafelistCopyFromExistingSafelist() {
        Safelist safelist1 = Safelist.basic();
        Safelist safelist2 = Safelist.copy(safelist1);
        assertNotNull(safelist2);
        assertEquals(safelist1, safelist2);
    }

}