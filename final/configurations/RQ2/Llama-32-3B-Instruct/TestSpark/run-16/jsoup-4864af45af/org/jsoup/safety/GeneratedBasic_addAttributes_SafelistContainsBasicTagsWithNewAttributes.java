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
public class GeneratedBasic_addAttributes_SafelistContainsBasicTagsWithNewAttributes {

    @Mock
    private Attributes attributes;

    @Test
    public void basic_addAttributes_SafelistContainsBasicTagsWithNewAttributes() {
        Safelist safelist = Safelist.basic();
        safelist.addAttributes("newTag", "newValue");
        when(attributes.getAttributeNames()).thenReturn(new String[]{"src"});
        assertThat(safelist.getAttributeNames(), is(new String[]{"src"}));
    }

}