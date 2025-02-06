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

public class GeneratedPreserveRelativeLinks_preserveRelativeLinks_false {

    @Test
    public void preserveRelativeLinks_preserveRelativeLinks_false() {
        Safelist safelist = Safelist.preserveRelativeLinks(false).addProtocols("img", "src", "image.jpg");
        assertFalse(safelist.getEnforcedAttributes("img").containsKey("src"));
    }

}