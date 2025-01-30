package org.jsoup.safety;

import org.jdom2.IllegalDataException;
import org.jsoup.helper.StringUtil;
import org.jsoup.nodes.Document;
import org.jsoup.safety.Safelist;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class GeneratedRemoveTagsTest {

    @Test
    public void removeTagsTest() {
        Safelist safelist = Safelist.none();
        safelist.addTags("tag1", "tag2");
        safelist.removeTags("tag1");
        Assert.assertFalse(safelist.isSafeTag("tag1"));
        Assert.assertTrue(safelist.isSafeTag("tag2"));
    }

}