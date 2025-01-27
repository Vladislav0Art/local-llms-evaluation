package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class GeneratedNormalNameNullThrowsNullPointerException {

    @Test
    public void normalNameNullThrowsNullPointerException() {
        assertThrows(NullPointerException.class, () -> new Tag().normalName());
    }

}