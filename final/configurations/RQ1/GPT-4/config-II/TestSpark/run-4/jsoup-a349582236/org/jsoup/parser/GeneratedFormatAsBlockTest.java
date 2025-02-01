package org.jsoup.parser;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;
import org.jsoup.helper.Validate;
import org.junit.Test;

import static org.junit.Assert.*;

import java.lang.reflect.Field;

public class GeneratedFormatAsBlockTest {

    @Test
    public void formatAsBlockTest() {
        Tag tag = new Tag("p");
        assertFalse(tag.formatAsBlock());
    }

}