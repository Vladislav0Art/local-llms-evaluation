package org.jsoup.nodes;

import org.junit.Test;

import static org.mockito.Mockito.when;
import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

public class GeneratedHasKeyIgnoreCase {

    @Test
    public void hasKeyIgnoreCase() {
        Attributes attributes = new Attributes();
        attributes.add("KEY", "value");
        assertTrue(attributes.hasKeyIgnoreCase("KEY"));
    }

}