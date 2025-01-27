package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.HashSet;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;

public class GeneratedBasic_WithImages_Test {

    @Test
    public void basic_WithImages_Test() {
        Safelist safelist = Safelist.safelist();
        Set<String> tags = new HashSet<>(Arrays.asList("p", "img"));
        safelist = Safelist.addTags(safelist, tags.toArray(new String[0]));
        assertTrue(Safelist.basicWithImages().isBasic());
    }

}