package org.jsoup.safety;

import org.jsoup.safety.Safelist;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Element;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.jsoup.helper.Validate.validate;
import static org.jsoup.internal.Normalizer.lowerCase;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedRelaxed_RelaxedTags {

    @Mock
    private Element element;

    @Test
    public void relaxed_RelaxedTags() {
        Safelist safelist = Safelist.relaxed();
        assertThat(safelist.isSafeTag("h1"), is(true));
        assertThat(safelist.isSafeTag("h2"), is(false));
        validate(!safelist.isSafeTag("img"));
    }

}