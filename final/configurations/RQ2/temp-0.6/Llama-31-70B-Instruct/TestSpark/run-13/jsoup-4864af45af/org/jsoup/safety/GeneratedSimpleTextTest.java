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

public class GeneratedSimpleTextTest {

    @Test
    public void simpleTextTest() {
        Safelist safelist = Safelist.simpleText();
        Assert.assertTrue(safelist.getProtocols().isEmpty());
        Assert.assertEquals(1, safelist.getTags().size());
        Assert.assertTrue(safelist.getTags().contains("p"));
        Assert.assertTrue(safelist.getAttributes().isEmpty());
        Assert.assertFalse(safelist.getEnforcedProtocols().isEmpty());
        Assert.assertFalse(safelist.getEnforcedAttributes().isEmpty());
    }

}