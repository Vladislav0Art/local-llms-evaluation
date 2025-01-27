package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class GeneratedGetNameEmptyTagReturnsNull {

    @Test
    public void getNameEmptyTagReturnsNull() {
        assertNull(new Tag().getName());
    }

}