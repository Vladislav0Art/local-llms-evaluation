package org.jsoup.safety;

import org.jsoup.helper.Validate;
import org.junit.Test;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import static org.jsoup.internal.Normalizer.lowerCase;

public class GeneratedRelaxed {

    @Test
    public void relaxed() {
        Safelist safelist = Safelist.none();
        safelist.addTags("p");
        safelist.removeAttributes("style");
        safelist.addEnforcedAttribute("data-attr", "test-attr", "test-value");
        Assert.assertTrue(safelist.isSafeTag("div"));
    }

}