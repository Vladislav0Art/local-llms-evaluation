package org.jsoup.safety;

import org.junit.Test;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.jsoup.safety.Safelist;

import static org.junit.Assert.*;

public class GeneratedRemoveTagsTest {

    private Safelist safelist = new Safelist();

    @Test
    public void removeTagsTest() {
        String[] tags = {"div", "span"};
        Safelist newSafelist = safelist.removeTags(tags);
        assertNotNull(newSafelist);
    }

}