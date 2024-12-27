package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.jsoup.safety.Safelist;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;

import static org.mockito.Mockito.when;

import org.mockito.InjectMocks;

public class GeneratedBasicTest {

    @Test
    public void basicTest() {
        Safelist result = Safelist.basic();
        assertTrue(result.isSafeTag("p"));
        assertTrue(result.isSafeTag("img"));
        assertFalse(result.isSafeTag("script"));
    }

}