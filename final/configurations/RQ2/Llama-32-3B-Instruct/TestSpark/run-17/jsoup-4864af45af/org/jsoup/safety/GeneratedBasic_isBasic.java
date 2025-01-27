package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.HashSet;

public class GeneratedBasic_isBasic {

    @Test
    public void basic_isBasic() {
        Safelist safelist = Safelist.basic();
        assertNotNull(safelist);
        assertEquals(Safelist.basic(), safelist);
    }

}