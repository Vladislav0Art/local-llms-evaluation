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

public class GeneratedBasicWithImages {

    @Test
    public void basicWithImages() {
        Safelist safelist = Safelist.none();
        safelist.addTags("img");
        safelist.removeAttributes("style");
        safelist.addEnforcedAttribute("data-attr", "test-attr", "test-value");
        safelist.addProtocols("img", "image-types");
        Assert.assertTrue(safelist.isSafeTag("img"));
        Assert.assertFalse(safelist.isSafeTag("div"));
    }

}