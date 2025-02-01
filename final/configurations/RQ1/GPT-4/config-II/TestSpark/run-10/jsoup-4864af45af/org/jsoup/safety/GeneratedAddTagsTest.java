package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.jsoup.safety.Safelist;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedAddTagsTest {

    @Test
    public void addTagsTest() {
        Assert.assertEquals(Safelist.none().addTags("a", "b").toString(), new Safelist().toString());
    }

}