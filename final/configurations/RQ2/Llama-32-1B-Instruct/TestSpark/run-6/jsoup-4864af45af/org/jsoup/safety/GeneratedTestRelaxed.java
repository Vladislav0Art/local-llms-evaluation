package org.jsoup.safety;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Attribute;

import static org.jsoup.internal.Normalizer.lowerCase;

public class GeneratedTestRelaxed {

    private Document document;

    @BeforeEach
    public void init() {
        document = Jsoup.parse("<!DOCTYPE html><html><body></body></html>");
    }

    public String none() {
        return "none";
    }

    public String simpleText() {
        return "simple text";
    }

    public String basic() {
        return "basic text";
    }

    public String basicWithImages() {
        return "basic with images text";
    }

    public String relaxed() {
        return "relaxed text";
    }

    public Safelist copy() {
        return new Safelist();
    }

    @Test
    public void testRelaxed() {
        Safelist relaxed = new Safelist().relaxed();
        assertTrue(relaxed.isSafeTag("a"));
    }

}