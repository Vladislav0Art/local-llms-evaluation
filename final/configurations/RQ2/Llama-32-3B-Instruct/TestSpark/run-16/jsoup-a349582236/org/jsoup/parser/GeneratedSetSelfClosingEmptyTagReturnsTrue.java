package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class GeneratedSetSelfClosingEmptyTagReturnsTrue {

    @Test
    public void setSelfClosingEmptyTagReturnsTrue() {
        Tag tag = new Tag();
        assertTrue(tag.setSelfClosing());
    }

}