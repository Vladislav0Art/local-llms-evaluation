package org.jsoup.safety;

import org.junit.Test;

import static org.mockito.Mockito.*;

public class GeneratedTest {

    @Test
    public void simpleTextTest() {
        Safelist safelist = new Safelist();
        when(safelist.isSafeTag("p")).thenReturn(true);
        safelist.addTags("p", "class");
        assertAll(() -> mock(String.class).when(mock(String.class).isSafeAttribute("p", "class"));
    }

    @Test
    public void basicTextTest() {
        Safelist safelist = new Safelist();
        when(safelist.isSafeTag("img")).thenReturn(false);
        safelist.addTags("img", "src");
        assertAll(() -> mock(String.class).when(mock(String.class).isSafeAttribute("img", "src"));
    }

    @Test
    public void basicWithImagesTextTest() {
        Safelist safelist = new Safelist();
        when(safelist.isSafeTag("img")).thenReturn(false);
        when(safelist.getEnforcedAttributes("img")).thenReturn(Collections.singletonMap("src", "src-value"));
        safelist.addTags("img", "src");
        assertAll(() -> mock(String.class).when(mock(String.class).isSafeAttribute("img", "src"));
    }

    @Test
    public void relaxedTextTest() {
        Safelist safelist = new Safelist();
        when(safelist.isSafeTag("p")).thenReturn(true);
        safelist.addTags("p");
        assertAll(() -> mock(String.class).when(mock(String.class).isSafeAttribute("p"));
    }

    @Test
    public void relaxedTextWithImagesTest() {
        Safelist safelist = new Safelist();
        when(safelist.isSafeTag("img")).thenReturn(false);
        when(safelist.getEnforcedAttributes("img")).thenReturn(Collections.singletonMap("src", "src-value"));
        safelist.addTags("img");
        assertAll(() -> mock(String.class).when(mock(String.class).isSafeAttribute("img"));
    }

    @Test
    public void noneTextTest() {
        Safelist safelist = new Safelist();
        when(safelist.isSafeTag("p")).thenReturn(false);
        safelist.addTags("p");
        assertAll(() -> mock(String.class).when(mock(String.class).isSafeAttribute("p"));
    }

    @Test
    public void noneTextWithImagesTest() {
        Safelist safelist = new Safelist();
        when(safelist.isSafeTag("img")).thenReturn(false);
        when(safelist.getEnforcedAttributes("img")).thenReturn(Collections.singletonMap("src", "src-value"));
        safelist.addTags("img");
        assertAll(() -> mock(String.class).when(mock(String.class).isSafeAttribute("img"));
    }

    @Test
    public void basicImageTextTest() {
        Safelist safelist = new Safelist();
        when(safelist.isSafeTag("img")).thenReturn(false);
        when(safelist.getEnforcedAttributes("img")).thenReturn(Collections.singletonMap("src", "src-value"));
        safelist.addTags("img", "src");
        assertAll(() -> mock(String.class).when(mock(String.class).isSafeAttribute("img", "src"));
    }

    @Test
    public void basicImageWithProtocolsTextTest() {
        Safelist safelist = new Safelist();
        when(safelist.isSafeTag("img")).thenReturn(false);
        when(safelist.getEnforcedAttributes("img")).thenReturn(Collections.singletonMap("src", "src-value"));
        safelist.addTags("img", "src");
        assertAll(() -> mock(String.class).when(mock(String.class).isSafeAttribute("img", "src"));
    }

    @Test
    public void basicImageWithProtocolsAndEnforcedAttributesTextTest() {
        Safelist safelist = new Safelist();
        when(safelist.isSafeTag("img")).thenReturn(false);
        when(safelist.getEnforcedAttributes("img")).thenReturn(Collections.singletonMap("src", "src-value"));
        safelist.addTags("img", "src");
        assertAll(() -> mock(String.class).when(mock(String.class).isSafeAttribute("img", "src"));
    }

    @Test
    public void relaxedImageTextTest() {
        Safelist safelist = new Safelist();
        when(safelist.isSafeTag("img")).thenReturn(true);
        safelist.addTags("img");
        assertAll(() -> mock(String.class).when(mock(String.class).isSafeAttribute("img"));
    }

    @Test
    public void relaxedImageWithProtocolsTextTest() {
        Safelist safelist = new Safelist();
        when(safelist.isSafeTag("img")).thenReturn(true);
        when(safelist.getEnforcedAttributes("img")).thenReturn(Collections.singletonMap("src", "src-value"));
        safelist.addTags("img", "src");
        assertAll(() -> mock(String.class).when(mock(String.class).isSafeAttribute("img", "src"));
    }

}