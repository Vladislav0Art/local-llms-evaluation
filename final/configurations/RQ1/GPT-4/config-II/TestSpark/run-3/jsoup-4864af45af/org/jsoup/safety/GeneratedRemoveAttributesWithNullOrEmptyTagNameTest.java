package org.jsoup.safety;

import org.jsoup.helper.Validate;
import org.jsoup.nodes.Attributes;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class GeneratedRemoveAttributesWithNullOrEmptyTagNameTest {

    @Test
    public void RemoveAttributesWithNullOrEmptyTagNameTest() {
        Safelist safelist = Safelist.simpleText();
        safelist.removeAttributes("", "id");
    }

}