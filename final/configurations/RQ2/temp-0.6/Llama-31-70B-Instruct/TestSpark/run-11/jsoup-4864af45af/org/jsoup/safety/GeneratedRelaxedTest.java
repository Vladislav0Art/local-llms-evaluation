package org.jsoup.safety;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedRelaxedTest {

    @Mock
    private Safelist safelist;

    @Test
    public void relaxedTest() {
        when(safelist.relaxed()).thenReturn(safelist);
        assertEquals(safelist, safelist.relaxed());
    }

}