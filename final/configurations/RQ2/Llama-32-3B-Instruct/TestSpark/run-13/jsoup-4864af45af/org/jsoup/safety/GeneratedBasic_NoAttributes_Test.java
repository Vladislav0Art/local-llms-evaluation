package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.HashSet;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;

public class GeneratedBasic_NoAttributes_Test {

    @Test
    public void basic_NoAttributes_Test() {
        Safelist safelist = Safelist.safelist();
        Set<String> tags = new HashSet<>(Arrays.asList("p", "img"));
        assertTrue(Safelist.addTags(safelist, tags.toArray(new String[0])).isBasic());
    }

}