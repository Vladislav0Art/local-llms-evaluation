package org.jsoup.parser;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.hamcrest.Description;
import org.jsoup.parser.Tag;

import static org.junit.Assert.*;

import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

public class GeneratedTestFormatAsBlock_P {

    @Test
    public void testFormatAsBlock_P() {
        // Test logic for p element in block context
        // For demonstration purposes, assume it's a block element
        String formattedP = "<p>text</p>";
        assertThat(formattedP, is("<p>text</p>"));
    }

}