package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedRemoveTagsTest {

    @Test
    public void removeTagsTest() {
        Safelist safelist = new Safelist();
        String[] tags = {"tag1", "tag2"};
        Safelist result = safelist.removeTags(tags);
        assertNotNull(result);
    }

}