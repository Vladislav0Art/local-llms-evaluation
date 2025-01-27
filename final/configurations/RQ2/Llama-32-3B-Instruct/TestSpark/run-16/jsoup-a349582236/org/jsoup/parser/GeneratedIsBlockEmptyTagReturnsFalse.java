package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class GeneratedIsBlockEmptyTagReturnsFalse {

    @Test
    public void isBlockEmptyTagReturnsFalse() {
        Tag tag = new Tag();
        assertTrue(!tag.isBlock());
    }

}