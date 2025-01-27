package org.jsoup.nodes;

import org.junit.Test;

import static org.mockito.Mockito.when;
import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

public class GeneratedHasKey {

    @Test
    public void hasKey() {
        Attributes attributes = new Attributes();
        attributes.add("key", "value");
        assertTrue(attributes.hasKey("key"));
    }

}