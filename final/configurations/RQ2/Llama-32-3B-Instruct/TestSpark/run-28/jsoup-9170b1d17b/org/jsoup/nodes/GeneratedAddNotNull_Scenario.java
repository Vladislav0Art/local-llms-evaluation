package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

public class GeneratedAddNotNull_Scenario {

    @Test
    public void addNotNull_Scenario() {
        Attributes attrs = new Attributes();
        attrs.add("key", "value");
        assertEquals(1, attrs.size());
    }

}