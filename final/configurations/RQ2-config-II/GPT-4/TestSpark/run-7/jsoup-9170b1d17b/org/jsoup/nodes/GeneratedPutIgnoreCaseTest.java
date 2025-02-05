package org.jsoup.nodes;

import org.jsoup.nodes.*;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

public class GeneratedPutIgnoreCaseTest {

    @Test
    public void putIgnoreCaseTest() {
        Attributes attrs = new Attributes();
        attrs.putIgnoreCase("KEY", "value");
        String value = attrs.getIgnoreCase("key");
        assertEquals("value", value);
    }

}