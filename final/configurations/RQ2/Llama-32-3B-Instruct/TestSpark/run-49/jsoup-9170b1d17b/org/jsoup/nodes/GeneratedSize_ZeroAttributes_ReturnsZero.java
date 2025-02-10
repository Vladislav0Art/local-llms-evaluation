package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GeneratedSize_ZeroAttributes_ReturnsZero {

    @Test
    public void size_ZeroAttributes_ReturnsZero() {
        Attributes attributes = new Attributes();
        assertEquals(0, attributes.size());
    }

}