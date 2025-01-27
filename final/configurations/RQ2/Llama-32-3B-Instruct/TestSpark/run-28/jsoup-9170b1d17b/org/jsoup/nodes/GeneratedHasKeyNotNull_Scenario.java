package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

public class GeneratedHasKeyNotNull_Scenario {

    @Test
    public void hasKeyNotNull_Scenario() {
        Attributes attrs = new Attributes();
        attrs.add("key", null);
        assertTrue(attrs.hasKey("key"));
    }

}