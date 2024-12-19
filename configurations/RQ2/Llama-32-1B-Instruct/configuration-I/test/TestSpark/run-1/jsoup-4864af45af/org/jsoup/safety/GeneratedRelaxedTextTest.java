package org.jsoup.safety;

import org.junit.Test;

import static org.mockito.Mockito.*;

public class GeneratedRelaxedTextTest {

    @Test
    public void relaxedTextTest() {
        Safelist safelist = new Safelist();
        when(safelist.isSafeTag("p")).thenReturn(true);
        safelist.addTags("p");
        assertAll(() -> mock(String.class).when(mock(String.class).isSafeAttribute("p"));
    }

}