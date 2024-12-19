package org.jsoup.safety;

import org.junit.Test;

import static org.mockito.Mockito.*;

public class GeneratedNoneTextWithImagesTest {

    @Test
    public void noneTextWithImagesTest() {
        Safelist safelist = new Safelist();
        when(safelist.isSafeTag("img")).thenReturn(false);
        when(safelist.getEnforcedAttributes("img")).thenReturn(Collections.singletonMap("src", "src-value"));
        safelist.addTags("img");
        assertAll(() -> mock(String.class).when(mock(String.class).isSafeAttribute("img"));
    }

}