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
public class GeneratedAddAttributes_AddedAttributes {

    @Mock
    private Element element;

    @Test
    public void addAttributes_AddedAttributes() {
        Safelist safelist = Safelist.addAttributes("img", "alt", "test-alt");
        validate(safelist.getEnforcedAttributes("img").containsKey("alt"));
        validate(!safelist.getEnforcedAttributes("img").containsKey("src"));
    }

}