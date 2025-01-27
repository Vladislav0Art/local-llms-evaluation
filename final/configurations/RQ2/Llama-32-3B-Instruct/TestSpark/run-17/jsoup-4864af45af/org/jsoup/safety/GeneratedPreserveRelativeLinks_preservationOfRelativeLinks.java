package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.HashSet;

public class GeneratedPreserveRelativeLinks_preservationOfRelativeLinks {

    @Test
    public void preserveRelativeLinks_preservationOfRelativeLinks() {
        Safelist safelist = Safelist.relaxed().preserveRelativeLinks(true);
        assertNotNull(safelist);
        assertTrue((Boolean) ((Map<String, Boolean>) safelist.getEnforcedAttributes("a")).get("rel"));
    }

}