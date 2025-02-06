package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.Set;

import org.jsoup.helper.Validate;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Element;

import static org.jsoup.internal.Normalizer.lowerCase;
import static org.mockito.Mockito.when;

public class GeneratedNone_AddTags_EmptySet_ReturnsSame {

    @Test
    public void none_AddTags_EmptySet_ReturnsSame() {
        Safelist safelist = Safelist.none();
        Set<String> tags = new HashSet<>();
        safelist = safelist.addTags(tags.toArray(new String[0]));
        assertTrue(Validate.equals(safelist, Safelist.none()));
    }

}