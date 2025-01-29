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

public class GeneratedAddAttributes_Safelist {

    @Test
    public void addAttributes_Safelist() {
        Safelist list = Safelist.none();
        List<String> tags = new ArrayList<>();
        tags.add("a", "href=\"https://example.com\"");
        list.addAttributes(tags);
        Assert.assertFalse(list.isSafeAttribute("a"));
        Assert.assertTrue(list.isSafeAttribute("href=\"https://example.com\""));
    }

}