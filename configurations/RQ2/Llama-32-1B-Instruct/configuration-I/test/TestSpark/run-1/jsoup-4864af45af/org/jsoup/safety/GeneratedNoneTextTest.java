package org.jsoup.safety;

import org.junit.Test;

import static org.mockito.Mockito.*;

public class GeneratedNoneTextTest {

    @Test
    public void noneTextTest() {
        Safelist safelist = new Safelist();
        when(safelist.isSafeTag("p")).thenReturn(false);
        safelist.addTags("p");
        assertAll(() -> mock(String.class).when(mock(String.class).isSafeAttribute("p"));
    }

}