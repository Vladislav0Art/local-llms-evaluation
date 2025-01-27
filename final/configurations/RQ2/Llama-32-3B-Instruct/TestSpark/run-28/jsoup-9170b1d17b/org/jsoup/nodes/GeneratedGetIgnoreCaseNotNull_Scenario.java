package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

public class GeneratedGetIgnoreCaseNotNull_Scenario {

    @Test
    public void getIgnoreCaseNotNull_Scenario() {
        Attributes attrs = new Attributes();
        attrs.add("KEY", "value");
        assertEquals("value", (String) attrs.getIgnoreCase("KEY"));
    }

}