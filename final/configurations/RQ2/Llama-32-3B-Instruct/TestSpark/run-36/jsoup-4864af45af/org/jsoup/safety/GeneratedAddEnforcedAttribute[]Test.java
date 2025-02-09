package org.jsoup.safety;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.mockito.Mockito.when;

public class GeneratedAddEnforcedAttribute[]

Test {

    @Test
    public void addEnforcedAttribute[] Test() {
        Safelist safelist = Safelist.addEnforcedAttribute("img", "src", "https://example.com");
        assertTrue(safelist.isSafeAttribute("img", null, null));
    }

}