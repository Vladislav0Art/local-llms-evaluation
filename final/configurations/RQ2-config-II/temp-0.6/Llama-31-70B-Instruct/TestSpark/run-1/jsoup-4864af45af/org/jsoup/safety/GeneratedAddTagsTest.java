package org.jsoup.safety;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.when;

public class GeneratedAddTagsTest {

    @Test
    public void addTagsTest() {
        Safelist safelist = new Safelist();
        String[] tags = {"a", "b", "c"};
        safelist.addTags(tags);
        Assert.assertNotNull(safelist.tagNames);
        Assert.assertEquals(3, safelist.tagNames.size());
    }

}