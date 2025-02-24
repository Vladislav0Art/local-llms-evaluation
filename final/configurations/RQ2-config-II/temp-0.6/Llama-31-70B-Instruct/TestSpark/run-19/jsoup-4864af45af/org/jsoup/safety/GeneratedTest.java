package org.jsoup.safety;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Tag;
import org.junit.Test;

public class GeneratedTest {

    private Safelist safelist;

    @Test
    public void noneTest() {
        safelist = Safelist.none();
        assertTrue(safelist.isEmpty());
    }

    @Test
    public void simpleTextTest() {
        safelist = Safelist.simpleText();
        assertTrue(safelist.isSafeTag(Tag.valueOf("p").getName()));
    }

    @Test
    public void basicTest() {
        safelist = Safelist.basic();
        assertTrue(safelist.isSafeTag(Tag.valueOf("a").getName()));
    }

    @Test
    public void basicWithImagesTest() {
        safelist = Safelist.basicWithImages();
        assertTrue(safelist.isSafeTag(Tag.valueOf("img").getName()));
    }

    @Test
    public void relaxedTest() {
        safelist = Safelist.relaxed();
        assertTrue(safelist.isSafeTag(Tag.valueOf("div").getName()));
    }

    @Test
    public void addTagsTest() {
        safelist = new Safelist();
        safelist.addTags("p", "h1");
        assertTrue(safelist.isSafeTag(Tag.valueOf("p").getName()));
        assertTrue(safelist.isSafeTag(Tag.valueOf("h1").getName()));
    }

}