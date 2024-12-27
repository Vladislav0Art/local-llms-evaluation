package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;
import java.util.ArrayList;

public class GeneratedHasDeclaredValueForKey_emptyString {

    @Test
    public void hasDeclaredValueForKey_emptyString() {
        Attributes attributes = new Attributes();
        String key = "";
        assertFalse(attributes.hasDeclaredValueForKey(key));
    }

}