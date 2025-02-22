package org.jsoup.parser;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;
import org.jsoup.internal.Normalizer;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

@RunWith(JUnit4.class)
public class GeneratedIsFormListedTest {

    private Tag tag;

    @Before
    public void setUp() {
        tag = new Tag("div");
    }

    @Test
    public void isFormListedTest() {
        assertFalse(tag.isFormListed());
    }

}