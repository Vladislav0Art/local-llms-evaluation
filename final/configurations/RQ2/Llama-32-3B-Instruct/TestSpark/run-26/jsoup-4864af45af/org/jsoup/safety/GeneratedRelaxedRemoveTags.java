package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.mockito.Mockito.when;

public class GeneratedRelaxedRemoveTags {

    @Test
    public void relaxedRemoveTags() {
        String[] tags = {"a", "b"};
        Safelist safelist = Safelist.relaxed().removeTags(tags);
        boolean isSafeTag = safelist.isSafeTag("c");
        assertFalse(isSafeTag);
    }
}

}