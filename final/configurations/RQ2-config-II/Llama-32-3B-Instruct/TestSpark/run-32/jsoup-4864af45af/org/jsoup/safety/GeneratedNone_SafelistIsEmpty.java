package org.jsoup.safety;

import org.jsoup.safety.Safelist;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedNone_SafelistIsEmpty {

    @Mock
    private String tag;

    @Test
    public void none_SafelistIsEmpty() {
        Safelist safelist = Safelist.none();
        assertTrue(safelist.isEmpty());
    }

}