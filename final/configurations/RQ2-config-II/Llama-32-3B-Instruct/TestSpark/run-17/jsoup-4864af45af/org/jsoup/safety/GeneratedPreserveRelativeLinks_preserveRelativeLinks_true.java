package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Element;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class GeneratedPreserveRelativeLinks_preserveRelativeLinks_true {

    @Test
    public void preserveRelativeLinks_preserveRelativeLinks_true() {
        Safelist safelist = Safelist.preserveRelativeLinks(true).addProtocols("a", "hreflang", "en-US");
        assertTrue(safelist.getEnforcedAttributes("a").containsKey("hreflang"));
    }

}