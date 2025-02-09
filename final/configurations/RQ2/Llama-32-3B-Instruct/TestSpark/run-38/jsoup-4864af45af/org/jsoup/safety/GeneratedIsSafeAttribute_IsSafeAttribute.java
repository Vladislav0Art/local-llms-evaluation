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
public class GeneratedIsSafeAttribute_IsSafeAttribute {

    @Mock
    private Element element;

    @Test
    public void isSafeAttribute_IsSafeAttribute() {
        Safelist safelist = Safelist.basicWithImages();
        validate(Safelist.none().isSafeAttribute("img", element, new Attribute()));
        validate(!Safelist.relaxed().isSafeAttribute("h2", element, new Attribute()));
    }

}