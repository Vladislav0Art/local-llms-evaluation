package org.jsoup.safety;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedBasicWithImagesTest {

    @Mock
    private Safelist safelist;

    @Test
    public void basicWithImagesTest() {
        Safelist actual = Safelist.basicWithImages();
        assertNotNull(actual);
    }

}