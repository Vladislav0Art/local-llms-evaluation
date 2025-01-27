package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;

public class GeneratedNone {

    @Test
    public void none() {
        Safelist none = Safelist.none();
        assertFalse(none.isSafeTag("div"));
    }

}