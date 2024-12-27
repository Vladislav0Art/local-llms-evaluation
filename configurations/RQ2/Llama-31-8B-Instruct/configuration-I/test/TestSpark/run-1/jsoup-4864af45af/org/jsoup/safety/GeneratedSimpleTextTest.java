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

public class GeneratedSimpleTextTest {

    @Test
    public void simpleTextTest() {
        Safelist result = Safelist.simpleText();
        assertTrue(result.isSafeTag("p"));
        assertFalse(result.isSafeTag("script"));
    }

}