package org.jsoup.safety;

import org.junit.jupiter.api.Test;
import org.jsoup.helper.Validate;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Element;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import static org.jsoup.internal.Normalizer.lowerCase;

public class GeneratedAddTags_Safelist {

    @Test
    public void addTags_Safelist() {
        Safelist list = Safelist.none();
        list.addTags("a", "b");
        Assert.assertTrue(list.isSafeTag("a"));
        Assert.assertFalse(list.isSafeTag("c"));
        Assert.assertTrue(list.isSafeTag("<p>");
    }

}