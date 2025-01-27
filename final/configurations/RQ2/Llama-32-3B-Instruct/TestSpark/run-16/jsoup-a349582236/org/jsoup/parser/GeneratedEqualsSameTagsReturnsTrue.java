package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class GeneratedEqualsSameTagsReturnsTrue {

    @Test
    public void equalsSameTagsReturnsTrue() {
        Tag tag1 = new Tag();
        Tag tag2 = new Tag();
        assertTrue(tag1.equals(tag2));
    }

}