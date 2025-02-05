package org.jsoup.safety;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedBasicTest {

    @Mock
    private Safelist safelist;

    @Test
    public void basicTest() {
        when(safelist.basic()).thenReturn(new Safelist());
        assertEquals(new Safelist(), safelist.basic());
    }

}