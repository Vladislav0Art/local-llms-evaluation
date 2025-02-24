package org.jsoup.safety;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedNoneTest {

    @Mock
    private Safelist safelist;

    @Test
    public void noneTest() {
        Safelist actual = Safelist.none();
        assertNotNull(actual);
    }

}