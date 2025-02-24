package org.jsoup.safety;

import org.jsoup.safety.Safelist;
import org.jsoup.helper.Validate;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Element;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentMatchers;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

@RunWith(PowerMockRunner.class)
public class GeneratedTest {

    @Before
    public void setup() {
        PowerMockito.mockStatic(Validate.class);
    }

    @Test
    public void noneTest() {
        // Given
        Safelist safelist = Safelist.none();

        // When
        boolean result = safelist.isSafeTag("tag");

        // Then
        Assert.assertFalse(result);
    }

    @Test
    public void simpleTextTest() {
        // Given
        Safelist safelist = Safelist.simpleText();

        // When
        boolean result = safelist.isSafeTag("tag");

        // Then
        Assert.assertFalse(result);
    }

}