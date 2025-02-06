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

public class GeneratedNone_SafeTag {

    @Test
    public void none_SafeTag() {
        Safelist safelist = Safelist.none();
        assertTrue(safelist.isSafeTag("img"));
        assertFalse(safelist.isSafeTag("script"));
    }

}