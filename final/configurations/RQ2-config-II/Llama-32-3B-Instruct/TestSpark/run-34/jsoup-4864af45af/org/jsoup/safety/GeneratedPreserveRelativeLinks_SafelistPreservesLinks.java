package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.Set;

import org.jsoup.nodes.Element;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer.lowerCase;

public class GeneratedPreserveRelativeLinks_SafelistPreservesLinks {

    @Test
    public void preserveRelativeLinks_SafelistPreservesLinks() {
        Safelist safelist = Safelist.none();
        Element element = new Element("a");
        boolean preserve = true;
        safelist = safelist.preserveRelativeLinks(preserve);
        assertTrue(safelist.isSafeAttribute(null, element, null));
    }

}