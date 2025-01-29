package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;

import java.util.HashMap;
import java.util.Map;

public class GeneratedTestTagNameEquals {

    @Test
    public void testTagNameEquals() {
        String[] tags = {"img", "div"};
        Tag tag1 = new Tag("img");
        Tag tag2 = new Tag("div");

        Assert.assertEquals(tag1.getName(), tag2.getName());
    }

}