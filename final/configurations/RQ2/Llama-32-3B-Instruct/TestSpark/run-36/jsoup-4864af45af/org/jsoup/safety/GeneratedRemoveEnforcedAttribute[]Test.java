package org.jsoup.safety;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.mockito.Mockito.when;

public class GeneratedRemoveEnforcedAttribute[]

Test {

    @Test
    public void removeEnforcedAttribute[] Test() {
        Safelist safelist = Safelist.basic();
        Safelist newSafelist = safelist.removeEnforcedAttribute("img", "src");
        assertFalse(newSafelist.isSafeAttribute("img", null, null));
    }

}