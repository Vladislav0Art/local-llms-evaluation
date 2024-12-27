package org.jsoup.parser;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.hamcrest.Description;
import org.jsoup.parser.Tag;

import static org.junit.Assert.*;

import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

public class GeneratedTestFormatAsBlock_Div {

    @Test
    public void testFormatAsBlock_Div() {
        String formattedDiv = "<div>text</div>";
        assertThat(formattedDiv, is("<div>text</div>"));
    }

}