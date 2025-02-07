package org.jsoup.safety;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

public class GeneratedTest {

    @Test
    public void basic() {
        Safelist safelist = new Safelist();
        assertFalse(safelist.isSafeTag("img"));
        assertTrue(safelist.isSafeTag("p"));
    }

    @Test
    public void none() {
        Safelist safelist = new Safelist();
        assertEquals(null, safelist.none());
    }

    @Test
    public void simpleText() {
        Safelist safelist = new Safelist();
        assertTrue(safelist.simpleText().isSafeTag("text"));
        assertFalse(safelist.simpleText().isSafeTag("img"));
    }

    @Test
    public void basicWithImages() {
        Safelist safelist = new Safelist();
        assertTrue(safelist.basicWithImages().isSafeTag("img"));
        assertFalse(safelist.basicWithImages().isSafeTag("text"));
    }

    @Test
    public void relaxed() {
        Safelist safelist = new Safelist();
        assertTrue(safelist.relativelySanitized());
        assertFalse(safelist.relativelySanitized());
    }

    @Test
    public void noneWithLinks() {
        Safelist safelist = new Safelist();
        assertEquals(null, safelist.none(true));
    }

    @Test
    public void simpleTextWithLinks() {
        Safelist safelist = new Safelist();
        assertTrue(safelist.simpleText().isSafeTag("a"));
        assertFalse(safelist.simpleText().isSafeTag("img"));
    }

    @Test
    public void basicWithImagesAndLinks() {
        Safelist safelist = new Safelist();
        assertTrue(safelist.basicWithImages().isSafeTag("img"));
        assertTrue(safelist.basicWithImages().isSafeTag("a"));
        assertFalse(safelist.basicWithImages().isSafeTag("text"));
    }

    @Test
    public void relaxedWithLinks() {
        Safelist safelist = new Safelist();
        assertTrue(safelist.relativelySanitized());
        assertTrue(safelist.relativelySanitized());
    }

    @Test
    public void noneWithProtocols() {
        Safelist safelist = new Safelist();
        assertEquals(null, safelist.none(true));
    }

    @Test
    public void simpleTextWithProtocols() {
        Safelist safelist = new Safelist();
        assertTrue(safelist.simpleText().isSafeTag("img"));
    }

    @Test
    public void basicWithImagesAndProtocols() {
        Safelist safelist = new Safelist();
        assertTrue(safelist.basicWithImages(true).isSafeTag("img"));
        assertTrue(safelist.basicWithImages(true).isSafeTag("a"));
        assertFalse(safelist.basicWithImages(true).isSafeTag("text"));
    }

    @Test
    public void basicWithProtocols() {
        Safelist safelist = new Safelist();
        assertTrue(safelist.basic(true).addProtocols("", "", "http://www.w3.org/2000/svg", ""));
        assertFalse(safelist.basic(true).isSafeTag("img"));
    }

    @Test
    public void basicWithLinksAndProtocols() {
        Safelist safelist = new Safelist();
        assertTrue(safelist.basic(true).addProtocols("", "", "http://www.w3.org/2000/svg", ""));
        assertTrue(safelist.basicWithImages(true).isSafeTag("img"));
        assertFalse(safelist.basicWithImages(true).isSafeTag("a"));
    }

    @Test
    public void relaxedWithLinksAndProtocols() {
        Safelist safelist = new Safelist();
        assertTrue(safelist.relativelySanitized());
        assertTrue(safelist.relativelySanitized());
        assertTrue(safelist.relativelySanitized());
    }

}