package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.IsAnything.anything;

public class GeneratedCopyConstructorTest {

    @Test
    public void copyConstructorTest() {
        Safelist safelistOrig = new Safelist();
        safelistOrig.addTags("tag1", "tag2");
        Safelist safelistCopy = new Safelist(safelistOrig);
        Assert.assertTrue(safelistCopy.isSafeTag("tag1"));
        Assert.assertTrue(safelistCopy.isSafeTag("tag2"));
    }

}