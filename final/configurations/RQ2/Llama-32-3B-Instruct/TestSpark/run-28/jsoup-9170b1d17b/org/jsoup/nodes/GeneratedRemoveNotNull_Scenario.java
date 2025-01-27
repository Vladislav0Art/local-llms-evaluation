package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

public class GeneratedRemoveNotNull_Scenario {

    @Test
    public void removeNotNull_Scenario() {
        Attributes attrs = new Attributes();
        attrs.add("key", "value");
        assertTrue(attrs.hasKey("key"));
        attrs.remove("key");
        assertFalse(attrs.hasKey("key"));
    }

}