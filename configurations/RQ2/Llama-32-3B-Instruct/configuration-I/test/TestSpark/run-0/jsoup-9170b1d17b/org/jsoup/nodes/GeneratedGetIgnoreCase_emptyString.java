package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;
import java.util.ArrayList;

public class GeneratedGetIgnoreCase_emptyString {

    @Test
    public void getIgnoreCase_emptyString() {
        Attributes attributes = new Attributes();
        String result = attributes.getIgnoreCase("");
        assertTrue(result.isEmpty());
    }

}