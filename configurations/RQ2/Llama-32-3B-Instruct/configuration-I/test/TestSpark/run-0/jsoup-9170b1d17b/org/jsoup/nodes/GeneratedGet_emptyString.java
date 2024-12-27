package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;
import java.util.ArrayList;

public class GeneratedGet_emptyString {

    @Test
    public void get_emptyString() {
        Attributes attributes = new Attributes();
        String result = attributes.get("");
        assertTrue(result.isEmpty());
    }

}