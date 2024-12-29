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

public class GeneratedNone {

    @Test
    public void none() {
        Safelist safelist = Safelist.none();
        Assert.assertFalse(safelist.isSafeTag("p"));
        Assert.assertFalse(safelist.isSafeTag("img"));
    }

}