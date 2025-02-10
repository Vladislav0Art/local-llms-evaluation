package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GeneratedGet_NullValue_ReturnsEmptyString {

    @Test
    public void get_NullValue_ReturnsEmptyString() {
        Document doc = new Document();
        String result = new Attributes().get(doc, "");
        assertEquals("", result);
    }

}