package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.Set;

public class GeneratedPreserveRelativeLinks_Preserve {

    @Test
    public void preserveRelativeLinks_Preserve() {
        Safelist preserveRelativeLinks = Safelist.preserveRelativeLinks(true);
        assertSame(Safelist.preserveRelativeLinks, preserveRelativeLinks);
    }

}