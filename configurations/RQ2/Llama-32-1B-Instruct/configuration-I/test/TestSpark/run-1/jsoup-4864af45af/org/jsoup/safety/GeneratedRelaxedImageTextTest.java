package org.jsoup.safety;

import org.junit.Test;

import static org.mockito.Mockito.*;

public class GeneratedRelaxedImageTextTest {

    @Test
    public void relaxedImageTextTest() {
        Safelist safelist = new Safelist();
        when(safelist.isSafeTag("img")).thenReturn(true);
        safelist.addTags("img");
        assertAll(() -> mock(String.class).when(mock(String.class).isSafeAttribute("img"));
    }

}