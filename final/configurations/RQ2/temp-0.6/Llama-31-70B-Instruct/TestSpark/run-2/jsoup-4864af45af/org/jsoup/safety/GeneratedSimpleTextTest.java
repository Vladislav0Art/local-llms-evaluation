package org.jsoup.safety;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedSimpleTextTest {

    @Mock
    private Safelist safelist;

    @Test
    public void simpleTextTest() {
        Safelist actual = Safelist.simpleText();
        assertNotNull(actual);
    }

}