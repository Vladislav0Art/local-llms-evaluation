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

public class GeneratedRemoveTags_Safelist {

    @Test
    public void removeTags_Safelist() {
        Safelist list = Safelist.none();
        list.removeTags("a");
        Assert.assertFalse(list.isSafeTag("a"));
        Assert.assertTrue(list.isSafeTag("<p>");
    }

}