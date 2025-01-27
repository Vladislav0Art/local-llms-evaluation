package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class GeneratedIsBlockKnownTagReturnsTrue {

    @Test
    public void isBlockKnownTagReturnsTrue() {
        Tag tag = new Tag();
        tag.setName("example");
        assertTrue(tag.isBlock());
    }

}