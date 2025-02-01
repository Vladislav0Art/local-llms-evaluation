package org.jsoup.parser;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class GeneratedNotEqualsTest {

    @Test
    public void notEqualsTest() {
        Tag tag1 = new Tag("TagTestName");
        Tag tag2 = new Tag("DifferentTagTestName");
        assertFalse(tag1.equals(tag2));
    }

}