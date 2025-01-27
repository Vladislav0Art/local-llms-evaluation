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
public class GeneratedBasicWithImages_SafelistContainsBasicTagsWithImageAttributes {

    @Mock
    private Attributes attributes;

    @Test
    public void basicWithImages_SafelistContainsBasicTagsWithImageAttributes() {
        Safelist safelist = Safelist.basicWithImages();
        when(attributes.getAttributeNames()).thenReturn(new String[]{"src"});
        assertThat(safelist.getTags(), is(new String[]{"img", "br", "hr", "p", "div"}));
    }

}