package org.jsoup.parser;

import org.junit.Before;
import org.junit.Test;

public class GeneratedTestValueOfTagNames {

    private Tag tag;

    @Before
    public void setUp() {
        tag = new Tag();
    }

    @Test
    public void testValueOfTagNames() {
        String[] tags = {"div", "span", "a"};
        for (String tag : tags) {
            Tag tagValue = Tag.valueOf(tag);
            assertNotNull(tagValue);
        }
    }

}