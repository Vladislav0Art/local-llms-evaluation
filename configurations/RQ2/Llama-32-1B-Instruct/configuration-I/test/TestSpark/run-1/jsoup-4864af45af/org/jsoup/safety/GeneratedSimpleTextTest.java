package org.jsoup.safety;

import org.junit.Test;

import static org.mockito.Mockito.*;

public class GeneratedSimpleTextTest {

    @Test
    public void simpleTextTest() {
        Safelist safelist = new Safelist();
        when(safelist.isSafeTag("p")).thenReturn(true);
        safelist.addTags("p", "class");
        assertAll(() -> mock(String.class).when(mock(String.class).isSafeAttribute("p", "class"));
    }

}