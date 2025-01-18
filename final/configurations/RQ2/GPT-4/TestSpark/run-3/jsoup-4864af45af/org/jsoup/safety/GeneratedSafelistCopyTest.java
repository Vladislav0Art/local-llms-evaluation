package org.jsoup.safety;

import org.jsoup.safety.Safelist;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedSafelistCopyTest {

    @Test
    public void safelistCopyTest() {
        Safelist original = Safelist.none();
        Safelist copied = new Safelist(original);
        Assert.assertEquals(original, copied);
    }

}