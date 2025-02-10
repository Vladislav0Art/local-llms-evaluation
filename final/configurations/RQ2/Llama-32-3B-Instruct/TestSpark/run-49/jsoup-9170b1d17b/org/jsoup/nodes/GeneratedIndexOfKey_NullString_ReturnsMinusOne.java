package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GeneratedIndexOfKey_NullString_ReturnsMinusOne {

    @Test
    public void indexOfKey_NullString_ReturnsMinusOne() {
        assertEquals(-1, new Attributes().indexOfKey(null));
    }

}