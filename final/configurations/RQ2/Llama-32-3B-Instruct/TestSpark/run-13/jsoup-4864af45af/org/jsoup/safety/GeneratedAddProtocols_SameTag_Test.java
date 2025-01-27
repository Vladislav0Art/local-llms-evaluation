package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.HashSet;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;

public class GeneratedAddProtocols_SameTag_Test {

    @Test
    public void addProtocols_SameTag_Test() {
        Safelist safelist = Safelist.safelist();
        Set<String> tags = new HashSet<>(Arrays.asList("p", "img"));
        safelist = Safelist.addTags(safelist, tags.toArray(new String[0]));
        assertTrue(Safelist.addProtocols(Safelist.relaxed(), "http://example.com").isRelaxed());
    }

}