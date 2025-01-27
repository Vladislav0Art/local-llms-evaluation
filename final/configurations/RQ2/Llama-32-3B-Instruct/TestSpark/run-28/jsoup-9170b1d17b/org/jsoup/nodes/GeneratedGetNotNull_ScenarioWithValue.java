package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

public class GeneratedGetNotNull_ScenarioWithValue {

    @Test
    public void getNotNull_ScenarioWithValue() {
        Attributes attrs = new Attributes();
        attrs.add("key", "value");
        assertEquals("value", (String) attrs.get("key"));
    }

}