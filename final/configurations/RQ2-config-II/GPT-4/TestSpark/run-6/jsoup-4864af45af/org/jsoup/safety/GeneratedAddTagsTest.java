package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedAddTagsTest {

    @Test
    public void addTagsTest() {
        Safelist safelist = new Safelist();
        String[] tags = {"tag1", "tag2"};
        Safelist result = safelist.addTags(tags);
        assertNotNull(result);
    }

}