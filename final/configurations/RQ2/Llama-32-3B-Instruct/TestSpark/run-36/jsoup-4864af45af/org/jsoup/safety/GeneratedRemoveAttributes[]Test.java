package org.jsoup.safety;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.mockito.Mockito.when;

public class GeneratedRemoveAttributes[]

Test {

    @Test
    public void removeAttributes[] Test() {
        Safelist safelist = Safelist.basic();
        Safelist newSafelist = safelist.removeAttributes("a", "href");
        assertFalse(newSafelist.isSafeAttribute("a", null, null));
    }

}