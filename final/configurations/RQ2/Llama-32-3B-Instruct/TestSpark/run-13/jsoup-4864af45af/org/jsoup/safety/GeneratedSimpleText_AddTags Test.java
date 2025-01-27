package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.HashSet;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;

public class GeneratedSimpleText_AddTags Test {

    @Test
    public void simpleText_AddTags

    Test() {
        Safelist safelist = Safelist.simpleText();
        Set<String> tags = new HashSet<>(Arrays.asList("p", "img"));
        safelist = safelist.addTags(tags.toArray(new String[0]));
        assertFalse(safelist.isSimpleText());
    }

}