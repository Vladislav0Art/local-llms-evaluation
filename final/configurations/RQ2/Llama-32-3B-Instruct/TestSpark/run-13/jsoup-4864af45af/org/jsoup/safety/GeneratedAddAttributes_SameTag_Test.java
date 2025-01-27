package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.HashSet;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;

public class GeneratedAddAttributes_SameTag_Test {

    @Test
    public void addAttributes_SameTag_Test() {
        Safelist safelist = Safelist.safelist();
        Set<String> tags = new HashSet<>(Arrays.asList("p", "img"));
        safelist = Safelist.addTags(safelist, tags.toArray(new String[0]));
        assertTrue(Safelist.addAttributes(Safelist.relaxed(), "p", Arrays.asList("style")).isRelaxed());
    }

}