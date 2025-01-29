package org.jsoup.safety;

import org.junit.jupiter.api.Test;
import org.jsoup.helper.Validate;
import org.jsoup.nodes.Document;

import static org.jsoup.internal.Normalizer.lowerCase;

public class GeneratedTest {

    @Test
    public void simpleTextNoTags() {
        Document document = new Document();
        Safelist safelist = Safelist.none();
        Assert.assertFalse(safelist.isSafeTag("a"));
        Assert.assertFalse(safelist.getEnforcedAttributes("a"));
    }

    @Test
    public void relaxedWithImages() {
        Document document = new Document();
        Safelist safelist = Safelist.relaxed();
        Document doc = new Document();
        Element a = document.createElement("a");
        a.setAttribute("href", "https://example.com");
        safelist.addTags("img", "a");
        safelist.addEnforcedAttribute("a", "src", "https://example.com/img.jpg");
        a.appendChild(document.createTextNode("<img src='https://example.com/img.jpg'>"));
        assert safelist.isSafeTag("a") == true;
        Assert.assertFalse(safelist.getEnforcedAttributes("a"));
    }

    @Test
    public void basicNoTags() {
        Document document = new Document();
        Safelist safelist = Safelist.basic();
        Assert.assertFalse(safelist.isSafeTag("a"));
        Assert.assertFalse(safelist.getEnforcedAttributes("a"));
    }

    @Test
    public void basicWithImages() {
        Document document = new Document();
        Safelist safelist = Safelist.basicWithImages();
        Document doc = new Document();
        Element a = document.createElement("a");
        a.setAttribute("href", "https://example.com");
        a.appendChild(document.createTextNode("<img src='https://example.com/img.jpg'>"));
        safelist.addTags("img", "a");
        safelist.addEnforcedAttribute("a", "src", "https://example.com/img.jpg");
        assert safelist.isSafeTag("a") == true;
        Assert.assertFalse(safelist.getEnforcedAttributes("a"));
    }

    @Test
    public void basicWithImagesNoTags() {
        Document document = new Document();
        Safelist safelist = Safelist.basicWithImages();
        Assert.assertTrue(safelist.isSafeTag("a"));
        Assert.assertTrue(safelist.getEnforcedAttributes("a"));
    }

    @Test
    public void simpleTextRelaxed() {
        Document document = new Document();
        Safelist safelist = Safelist.simpleText();
        Assert.assertFalse(safelist.isSafeTag("a"));
        Assert.assertFalse(safelist.getEnforcedAttributes("a"));
    }

    @Test
    public void basicRelaxed() {
        Document document = new Document();
        Safelist safelist = Safelist.basic();
        Assert.assertTrue(safelist.isSafeTag("a"));
        Assert.assertTrue(safelist.getEnforcedAttributes("a"));
    }

    @Test
    public void relaxedWithImagesRelaxed() {
        Document document = new Document();
        Safelist safelist = Safelist.relaxedWithImages();
        Assert.assertFalse(safelist.isSafeTag("img"));
        Assert.assertFalse(safelist.getEnforcedAttributes("img"));
    }

    @Test
    public void basicRelaxedWithImages() {
        Document document = new Document();
        Safelist safelist = Safelist.basicWithImages();
        Assert.assertTrue(safelist.isSafeTag("a"));
        Assert.assertTrue(safelist.getEnforcedAttributes("a"));
        assert safelist.isSafeTag("img");
        Assert.assertFalse(safelist.getEnforcedAttributes("img"));
    }

    @Test
    public void basicRelaxedWithImagesNoTags() {
        Document document = new Document();
        Safelist safelist = Safelist.basicWithImages();
        Assert.assertTrue(safelist.isSafeTag("a"));
        Assert.assertTrue(safelist.getEnforcedAttributes("a"));
    }

    @Test
    public void basicWithImagesRelaxed() {
        Document document = new Document();
        Safelist safelist = Safelist.basicWithImages();
        Assert.assertFalse(safelist.isSafeTag("img"));
        Assert.assertFalse(safelist.getEnforcedAttributes("img"));
        assert safelist.isSafeTag("a");
        Assert.assertTrue(safelist.getEnforcedAttributes("a"));
    }

    @Test
    public void basicRelaxedWithImagesNoTagsNoTags() {
        Document document = new Document();
        Safelist safelist = Safelist.basicWithImages();
        Assert.assertFalse(safelist.isSafeTag("img"));
        Assert.assertFalse(safelist.getEnforcedAttributes("img"));
        assert safelist.isSafeTag("a");
        Assert.assertTrue(safelist.getEnforcedAttributes("a"));
    }

}