package org.jsoup.safety;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedCopyConstructorTest {

    @Mock
    private Safelist mockSafelist;

    @Test
    public void copyConstructorTest() {
        Safelist safelist = new Safelist(mockSafelist);
        assertNotNull(safelist);
    }

}