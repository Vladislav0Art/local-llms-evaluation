package org.jsoup.safety;

import org.jsoup.safety.Safelist;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedPreserveRelativeLinks_ReturnsFalseByDefault {

    @Mock
    private String tag;

    @Test
    public void preserveRelativeLinks_ReturnsFalseByDefault() {
        Safelist safelist = Safelist.none();
        assertFalse(safelist.preserveRelativeLinks(false));
    }

}