package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;
import java.util.ArrayList;

public class GeneratedIsEmpty_emptyAttributes {

    @Test
    public void isEmpty_emptyAttributes() {
        Attributes attributes = new Attributes();
        assertTrue(attributes.isEmpty());
    }

}