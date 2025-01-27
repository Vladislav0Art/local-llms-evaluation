package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

public class GeneratedPutNotNull_Scenario {

    @Test
    public void putNotNull_Scenario() {
        Attributes attrs = new Attributes();
        attrs.put("key", "value");
        assertEquals("value", (String) attrs.get("key"));
    }

}