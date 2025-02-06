package org.jsoup.safety;

import org.jsoup.safety.Safelist;
import org.jsoup.helper.Validate;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

public class GeneratedRemoveTags {

    @Test
    public void removeTags() {
        Safelist safelist = Safelist.removeTags("img");
        assertFalse(safelist.isSafeTag("img"));
    }

}