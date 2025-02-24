package org.jsoup.safety;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedBasicTest {

    @Mock
    private Safelist safelist;

    @Test
    public void basicTest() {
        Safelist actual = Safelist.basic();
        assertNotNull(actual);
    }

}