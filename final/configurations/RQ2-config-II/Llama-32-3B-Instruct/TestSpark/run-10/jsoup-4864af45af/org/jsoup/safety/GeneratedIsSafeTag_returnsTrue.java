package org.jsoup.safety;

import org.jsoup.safety.Safelist;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashSet;

public class GeneratedIsSafeTag_returnsTrue {

    @Test
    public void isSafeTag_returnsTrue() {
        String tag = "img";
        assertTrue(Safelist.none().isSafeTag(tag));
    }

}