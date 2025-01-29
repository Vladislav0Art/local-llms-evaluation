package org.jsoup.safety;

import org.jsoup.Safelist;
import org.jsoup.helper.Validate;
import org.junit.jupiter.api.Test;

import static org.jsoup.safety.Safelist.none;
import static org.jsoup.safety.Safelist.simpleText;
import static org.jsoup.safety.Safelist.basic;
import static org.jsoup.safety.Safelist.basicWithImages;
import static org.jsoup.safety.Safelist.relaxed;

public class GeneratedTest {

    @Test
    public void test_none() {
        Safelist none = none();
        assertTrue(none.isSafeTag("a"));
        assertFalse(none.isSafeTag("img"));
    }

    @Test
    public void test_simpleText() {
        Safelist simpleText = simpleText();
        assertTrue(simpleText.isSafeTag("p"));
        assertFalse(simpleText.isSafeTag("div"));
    }

    @Test
    public void test_basic() {
        Safelist basic = basic();
        assertTrue(basic.isSafeTag("a"));
        assertFalse(basic.isSafeTag("img"));
    }

    @Test
    public void test_basicWithImages() {
        Safelist basicWithImages = basicWithImages();
        assertTrue(basicWithImages.isSafeTag("img"));
        assertFalse(basicWithImages.isSafeTag("div"));
    }

    @Test
    public void test_relaxed() {
        Safelist relaxed = relaxed();
        assertTrue(relaxed.isSafeTag("a"));
        assertFalse(relaxed.isSafeTag("img"));
    }

    @Test
    public void test_preserveRelativeLinksTrue() {
        Safelist safelist = new Safelist(true);
        safelist.preserveRelativeLinks(false);
        assertTrue(safelist.isSafeTag("a"));
        assertFalse(safelist.isSafeTag("img"));
    }

    @Test
    public void test_addTags() {
        Safelist safelist = none();
        safelist.addTags("div", "class");
        assertTrue(safelist.isSafeTag("a"));
        assertTrue(safelist.getEnforcedAttributes("div").containsKey("class"));
    }

    @Test
    public void test_removeTags() {
        Safelist safelist = new Safelist();
        safelist.removeTags("img");
        assertFalse(safelist.isSafeTag("img"));
    }

    @Test
    public void test_addAttributes() {
        Safelist safelist = none();
        safelist.addAttributes("a", "href", "https://example.com");
        assertTrue(safelist.getEnforcedAttributes("a").containsKey("href"));
    }

    @Test
    public void test_removeAttributes() {
        Safelist safelist = new Safelist();
        safelist.removeAttributes("img", "class");
        assertFalse(safelist.isSafeTag("div"));
    }

    @Test
    public void test_addEnforcedAttribute() {
        Safelist safelist = none();
        safelist.addEnforcedAttribute("a", "href", "https://example.com");
        assertTrue(safelist.getEnforcedAttributes("a").containsKey("href"));
    }

    @Test
    public void test_removeEnforcedAttribute() {
        Safelist safelist = new Safelist();
        safelist.removeEnforcedAttribute("a", "href");
        assertFalse(safelist.isSafeTag("a"));
    }

    @Test
    public void test_preserveRelativeLinksFalse() {
        Safelist safelist = relaxed(false);
        assertTrue(safelist.preserveRelativeLinks(true));
    }

}