package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashSet;

public class GeneratedPreserveRelativeLinks_Preserve_Preserve {

    @Test
    public void preserveRelativeLinks_Preserve_Preserve() {
        Safelist preserveRelativeLinks = Safelist.preserveRelativeLinks(true);
        assertSame(Safelist.preserveRelativeLinks, preserveRelativeLinks);
    }

}