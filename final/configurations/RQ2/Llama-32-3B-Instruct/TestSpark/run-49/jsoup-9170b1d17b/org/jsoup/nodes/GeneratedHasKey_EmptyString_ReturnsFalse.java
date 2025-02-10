package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GeneratedHasKey_EmptyString_ReturnsFalse {

    @Test
    public void hasKey_EmptyString_ReturnsFalse() {
        Attributes attributes = new Attributes();
        assertFalse(attributes.hasKey(""));
    }

}