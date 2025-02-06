package org.jsoup.safety;

import org.jsoup.safety.Safelist;
import org.jsoup.helper.Validate;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

public class GeneratedAddTags {

    @Test
    public void addTags() {
        Safelist safelist = Safelist.addTags("img");
        assertTrue(safelist.isSafeTag("img"));
    }

}