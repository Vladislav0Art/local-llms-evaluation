package org.jsoup.safety;

import org.jsoup.safety.Safelist;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

import java.util.HashSet;
import java.util.Set;

public class GeneratedPreserveRelativeLinks_PreserveLink {

    @Test
    public void preserveRelativeLinks_PreserveLink() {
        Safelist safelist = Safelist.relaxed();
        safelist = safelist.preserveRelativeLinks(true);
        assertTrue(safelist.isSafeAttribute("a", null, new Attribute(Validate.ATTR_HREF, "http://example.com")));
    }

}