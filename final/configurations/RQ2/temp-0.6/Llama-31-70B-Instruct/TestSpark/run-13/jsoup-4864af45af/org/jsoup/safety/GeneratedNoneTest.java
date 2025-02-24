package org.jsoup.safety;

import org.jsoup.helper.Validate;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Element;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import static org.jsoup.internal.Normalizer.lowerCase;

public class GeneratedNoneTest {

    @Test
    public void noneTest() {
        Safelist safelist = Safelist.none();
        Assert.assertTrue(safelist.getProtocols().isEmpty());
        Assert.assertTrue(safelist.getTags().isEmpty());
        Assert.assertTrue(safelist.getAttributes().isEmpty());
        Assert.assertFalse(safelist.getEnforcedProtocols().isEmpty());
        Assert.assertFalse(safelist.getEnforcedAttributes().isEmpty());
    }

}