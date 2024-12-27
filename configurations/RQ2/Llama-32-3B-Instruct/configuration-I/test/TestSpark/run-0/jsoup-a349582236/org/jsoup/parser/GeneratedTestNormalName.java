package org.jsoup.parser;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.hamcrest.Description;
import org.jsoup.parser.Tag;

import static org.junit.Assert.*;

import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

public class GeneratedTestNormalName {

    @Test
    public void testNormalName() {
        String normalName = "<div>test</div>";
        assertThat(normalName, is("<div>test</div>"));
    }

}