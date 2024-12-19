package org.jsoup.safety;

import org.junit.Test;

import static org.mockito.Mockito.*;

public class GeneratedRelaxedImageWithProtocolsTextTest {

    @Test
    public void relaxedImageWithProtocolsTextTest() {
        Safelist safelist = new Safelist();
        when(safelist.isSafeTag("img")).thenReturn(true);
        when(safelist.getEnforcedAttributes("img")).thenReturn(Collections.singletonMap("src", "src-value"));
        safelist.addTags("img", "src");
        assertAll(() -> mock(String.class).when(mock(String.class).isSafeAttribute("img", "src"));
    }

}