package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Element;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedNone_AddTagsSimpleText {

    @Mock
    private Element element;

    @Test
    public void none_AddTagsSimpleText() {
        Safelist safelist = Safelist.none();
        safelist = Safelist.addTags("h1", "img");
        assertEquals(2, Safelist.none().size());
    }

}