package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;
import java.util.ArrayList;

public class GeneratedAddAll_emptyAttributes {

    @Test
    public void addAll_emptyAttributes() {
        Attributes attributes1 = new Attributes();
        Attributes attributes2 = new Attributes();
        attributes1.addAll(attributes2);
        assertTrue(attributes1.isEmpty());
    }

}