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
public class GeneratedBasic_removeEnforcedAttribute_SafelistDoesNotContainRemovedEnforcedAttribute {

    @Mock
    private Attributes attributes;

    @Test
    public void basic_removeEnforcedAttribute_SafelistDoesNotContainRemovedEnforcedAttribute() {
        Safelist safelist = Safelist.basic();
        safelist.removeEnforcedAttribute("tag", "attribute");
        assertThat(safelist.getEnforcedAttributes("tag"), is(new String[0]));
    }

}