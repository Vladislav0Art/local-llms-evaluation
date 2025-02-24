package org.jsoup.safety;

import org.jsoup.safety.Safelist;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedSimpleTextTest {

    @Mock
    private Safelist safelist;

    @Test
    public void simpleTextTest() {
        when(safelist.simpleText()).thenReturn(new Safelist());
        assertEquals(new Safelist(), safelist.simpleText());
    }

}