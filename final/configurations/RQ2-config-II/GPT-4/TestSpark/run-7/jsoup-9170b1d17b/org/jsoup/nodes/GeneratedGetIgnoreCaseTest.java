package org.jsoup.nodes;

import org.jsoup.nodes.*;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

public class GeneratedGetIgnoreCaseTest {

    @Test
    public void getIgnoreCaseTest() {
        Attributes attrs = new Attributes();
        attrs.add("KEY", "value");
        String value = attrs.getIgnoreCase("key");
        assertEquals("value", value);
    }

}