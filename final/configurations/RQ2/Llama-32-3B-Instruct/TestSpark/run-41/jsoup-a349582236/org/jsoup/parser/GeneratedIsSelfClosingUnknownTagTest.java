package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;
import org.jsoup.helper.ParseSettings;

public class GeneratedIsSelfClosingUnknownTagTest {

    @Test
    public void isSelfClosingUnknownTagTest() {
        assertFalse(Tag.valueOf("unknown").isSelfClosing());
    }

}