package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.HashSet;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;

public class GeneratedPreserveRelativeLinks_NoPreserve_Test {

    @Test
    public void preserveRelativeLinks_NoPreserve_Test() {
        Safelist safelist = Safelist.safelist();
        Set<String> tags = new HashSet<>(Arrays.asList("p", "img"));
        safelist = Safelist.addTags(safelist, tags.toArray(new String[0]));
        assertFalse(Safelist.preserveRelativeLinks(false).isRelaxed());
    }

}