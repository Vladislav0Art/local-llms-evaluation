package org.jsoup.parser;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.hamcrest.Description;
import org.jsoup.parser.Tag;

import static org.junit.Assert.*;

import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

public class GeneratedTestValueOfTagsWithSettings {

    @Test
    public void testValueOfTagsWithSettings() {
        String tagsWithSettings = "<tag1 value=\"1\">text</tag1><tag2 value=\"2\">text2</tag2>";
        assertThat(tagsWithSettings, is("<tag1 value=\"1\">text</tag1><tag2 value=\"2\">text2</tag2>"));
    }

}