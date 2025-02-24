package org.jsoup.safety;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.when;

public class GeneratedRemoveTagsTest {

    @Test
    public void removeTagsTest() {
        Safelist safelist = new Safelist();
        String[] tags = {"a", "b", "c"};
        safelist.removeTags(tags);
        Assert.assertNotNull(safelist.tagNames);
        Assert.assertEquals(0, safelist.tagNames.size());
    }

}