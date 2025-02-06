package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Element;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class GeneratedAddAttributes_addAttributes {

    @Test
    public void addAttributes_addAttributes() {
        Safelist safelist = Safelist.basic().addAttributes("img", "alt", "image.jpg");
        assertTrue(safelist.getEnforcedAttributes("img").containsKey("alt"));
        assertTrue(safelist.getEnforcedAttributes("img").containsKey("src"));
    }

}