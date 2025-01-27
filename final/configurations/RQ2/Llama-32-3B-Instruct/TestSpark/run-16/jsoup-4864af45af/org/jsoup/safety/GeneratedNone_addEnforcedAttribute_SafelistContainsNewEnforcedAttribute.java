package org.jsoup.safety;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedNone_addEnforcedAttribute_SafelistContainsNewEnforcedAttribute {

    @Mock
    private Attributes attributes;

    @Test
    public void none_addEnforcedAttribute_SafelistContainsNewEnforcedAttribute() {
        Safelist safelist = Safelist.none();
        safelist.addEnforcedAttribute("tag", "attribute", "value");
        assertThat(safelist.getEnforcedAttributes("tag"), is(new String[]{"value"}));
    }

}