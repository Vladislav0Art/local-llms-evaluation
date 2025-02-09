package org.jsoup.safety;

import org.junit.Test;
import org.junit.Assert;
import org.jsoup.nodes.Attributes;

public class GeneratedRemoveTagsTest {

    @Test
    public void removeTagsTest() {
        Safelist safelist = new Safelist();
        safelist = safelist.addTags("p");
        safelist = safelist.removeTags("p");
        Assert.assertFalse(safelist.isSafeTag("p"));
    }

}