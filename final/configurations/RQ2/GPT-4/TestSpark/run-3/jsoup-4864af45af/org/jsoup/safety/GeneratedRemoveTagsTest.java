package org.jsoup.safety;

import org.jsoup.safety.Safelist;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedRemoveTagsTest {

    @Test
    public void removeTagsTest() {
        Safelist safelist = Safelist.none().addTags("div", "p").removeTags("div");
        Assert.assertFalse(safelist.isSafeTag("div"));
        Assert.assertTrue(safelist.isSafeTag("p"));
    }

}