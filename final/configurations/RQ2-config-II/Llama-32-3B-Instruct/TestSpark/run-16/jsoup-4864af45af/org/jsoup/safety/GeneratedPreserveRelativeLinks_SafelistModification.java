package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Element;

public class GeneratedPreserveRelativeLinks_SafelistModification {

    @Test
    public void preserveRelativeLinks_SafelistModification() {
        Safelist safelist = Safelist.none();
        boolean originalPreserveRelativeLinks = Validate.preserveRelativeLinks;
        Validate.preserveRelativeLinks(true);
        safelist = Safelist.preserveRelativeLinks(true);
        Validate.preserveRelativeLinks(originalPreserveRelativeLinks);
        assertNotNull(safelist);
    }

}