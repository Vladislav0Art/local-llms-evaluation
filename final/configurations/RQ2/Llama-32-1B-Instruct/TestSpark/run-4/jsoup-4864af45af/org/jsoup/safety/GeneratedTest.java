package org.jsoup.safety;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

public class GeneratedTest {

    private Document document = new Document();

    @Test
    public void noneScenario() {
        Safelist safelist = new Safelist();
        Assert.assertTrue(safelist.isSafeTag("a"));
        Assert.assertFalse(safelist.isSafeTag("script"));
    }

    @Test
    public void simpleTextScenario() {
        document.addTag("p", "Hello, world!");
        Safelist safelist = new Safelist();
        Assert.assertTrue(safelist.isSafeTag("p"));
    }

    @Test
    public void basicScenario() {
        Safelist safelist = new Safelist();
        Document document1 = new Document();
        Element element1 = document1.createElement("a");
        element1.appendChild(document1.createTextNode("Hello, world!"));
        Safelist safelist1 = new Safelist();
        Assert.assertTrue(safelist1.isSafeTag(element1.tagName()));
        Assert.assertFalse(safelist1.isSafeTag("script"));
    }

    @Test
    public void basicWithImagesScenario() {
        document.addTag("img", "image.jpg");
        Safelist safelist = new Safelist();
        Assert.assertTrue(safelist.isSafeTag("img"));
        Document document2 = new Document();
        Element element2 = document2.createElement("img");
        element2.appendChild(document2.createTextNode("Hello, world!"));
        Safelist safelist1 = new Safelist();
        Assert.assertFalse(safelist1.isSafeTag(element2.tagName()));
    }

    @Test
    public void relaxedScenario() {
        Safelist safelist = new Safelist();
        Document document = new Document();
        Element element = document.createElement("a");
        element.setAttribute("href", "https://example.com");
        Safelist safelist1 = new Safelist(safelist);
        Assert.assertTrue(safelist1.isSafeTag(element.tagName()));
    }

    @Test
    public void addTagsScenario() {
        Safelist safelist = new Safelist();
        Document document = new Document();
        Element element = document.createElement("a");
        safelist.addTag("img", "image.jpg");
        Assert.assertTrue(safelist.isSafeTag(element.tagName()));
        Safelist safelist2 = new Safelist(safelist);
        Assert.assertFalse(safelist2.isSafeTag(element.tagName()));
    }

    @Test
    public void removeTagsScenario() {
        Safelist safelist = new Safelist();
        Document document = new Document();
        Element element = document.createElement("a");
        safelist.addTag("img", "image.jpg");
        Assert.assertTrue(safelist.isSafeTag(element.tagName()));
        safelist.removeTags("a");
        Assert.assertFalse(safelist.isSafeTag(element.tagName()));
    }

    @Test
    public void addAttributesScenario() {
        Safelist safelist = new Safelist();
        Document document = new Document();
        Element element = document.createElement("p");
        safelist.addAttribute("style", "color: blue;");
        Assert.assertTrue(safelist.isSafeTag(element.tagName()));
        Safelist safelist2 = new Safelist(safelist);
        Assert.assertFalse(safelist2.isSafeTag(element.tagName()));
    }

    @Test
    public void removeAttributesScenario() {
        Safelist safelist = new Safelist();
        Document document = new Document();
        Element element = document.createElement("p");
        safelist.addAttribute("style", "color: blue;");
        Assert.assertTrue(safelist.isSafeTag(element.tagName()));
        safelist.removeAttribute("style");
        Assert.assertFalse(safelist.isSafeTag(element.tagName()));
    }

    @Test
    public void addEnforcedAttributesScenario() {
        Safelist safelist = new Safelist();
        Document document = new Document();
        Element element = document.createElement("p");
        safelist.addEnforcedAttribute("class", "my-class", "blue");
        Assert.assertTrue(safelist.isSafeTag(element.tagName()));
    }

    @Test
    public void removeEnforcedAttributesScenario() {
        Safelist safelist = new Safelist();
        Document document = new Document();
        Element element = document.createElement("p");
        safelist.addAttribute("style", "color: red;");
        Assert.assertTrue(safelist.isSafeTag(element.tagName()));
        safelist.removeAttribute("style");
    }

    @Test
    public void preserveRelativeLinksScenario() {
        Safelist safelist = new Safelist();
        Document document = new Document();
        Element element = document.createElement("a");
        safelist.preserveRelativeLinks(true);
        Assert.assertTrue(safelist.isSafeTag(element.tagName()));
    }

    @Test
    public void addProtocolsScenario() {
        Safelist safelist = new Safelist();
        Document document = new Document();
        Element element = document.createElement("p");
        safelist.addProtocol("img", "image/jpeg");
        Assert.assertTrue(safelist.isSafeTag(element.tagName()));
    }

    @Test
    public void removeProtocolsScenario() {
        Safelist safelist = new Safelist();
        Document document = new Document();
        Element element = document.createElement("p");
        safelist.removeProtocol("img", "image/jpeg");
        Assert.assertFalse(safelist.isSafeTag(element.tagName()));
    }

}