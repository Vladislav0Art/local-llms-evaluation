package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;
import java.util.ArrayList;

public class GeneratedRemove_keyNotFound {

    @Test
    public void remove_keyNotFound() {
        Attributes attributes = new Attributes();
        String key = "key";
        boolean result = !attributes.remove(key);
        assertTrue(result);
    }

}