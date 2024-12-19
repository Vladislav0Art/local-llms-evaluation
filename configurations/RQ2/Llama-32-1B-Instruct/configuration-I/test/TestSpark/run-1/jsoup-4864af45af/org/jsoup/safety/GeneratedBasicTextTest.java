package org.jsoup.safety;

import org.junit.Test;

import static org.mockito.Mockito.*;

public class GeneratedBasicTextTest {

    @Test
    public void basicTextTest() {
        Safelist safelist = new Safelist();
        when(safelist.isSafeTag("img")).thenReturn(false);
        safelist.addTags("img", "src");
        assertAll(() -> mock(String.class).when(mock(String.class).isSafeAttribute("img", "src"));
    }

}