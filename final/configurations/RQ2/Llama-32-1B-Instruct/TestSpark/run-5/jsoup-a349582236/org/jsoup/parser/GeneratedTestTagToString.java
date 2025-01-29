package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;

import java.util.HashMap;
import java.util.Map;

public class GeneratedTestTagToString {

    @Test
    public void testTagToString() {
        String[] tags = {"img", "div"};
        Tag tag1 = new Tag("img");
        Tag tag2 = new TagImpl("img");

        assertEquals(tag1.toString(), tag2.toString());
    }

}