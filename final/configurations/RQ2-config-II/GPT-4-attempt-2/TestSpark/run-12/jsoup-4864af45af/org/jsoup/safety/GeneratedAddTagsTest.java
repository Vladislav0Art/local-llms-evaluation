package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedAddTagsTest {

    @Test
    public void addTagsTest() {
        String tags = "tag";
        Safelist result = new Safelist().addTags(tags);
        assertNotNull(result);
    }

}