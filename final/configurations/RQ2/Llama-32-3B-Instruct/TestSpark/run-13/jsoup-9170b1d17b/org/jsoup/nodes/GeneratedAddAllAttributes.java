package org.jsoup.nodes;

import org.junit.Test;

import static org.mockito.Mockito.when;
import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

public class GeneratedAddAllAttributes {

    @Test
    public void addAllAttributes() {
        Attributes incoming1 = new Attributes();
        incoming1.add("key", "value");
        Attributes attributes = new Attributes();
        attributes.addAll(incoming1);
        assertEquals(1, attributes.size());
    }

}