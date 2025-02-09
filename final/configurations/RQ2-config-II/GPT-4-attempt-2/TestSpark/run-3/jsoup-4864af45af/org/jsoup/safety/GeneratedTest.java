package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.IsAnything.anything;

public class GeneratedTest {

    @Test
    public void noneTest() {
        Assert.assertThat(Safelist.none(), anything());
    }

    @Test
    public void simpleTextTest() {
        Assert.assertThat(Safelist.simpleText(), anything());
    }

    @Test
    public void basicTest() {
        Assert.assertThat(Safelist.basic(), anything());
    }

    @Test
    public void basicWithImagesTest() {
        Assert.assertThat(Safelist.basicWithImages(), anything());
    }

    @Test
    public void relaxedTest() {
        Assert.assertThat(Safelist.relaxed(), anything());
    }

    @Test
    public void addTagsTest() {
        Safelist safelist = new Safelist();
        safelist.addTags("tag1", "tag2");
        Assert.assertTrue(safelist.isSafeTag("tag1"));
        Assert.assertTrue(safelist.isSafeTag("tag2"));
    }

    @Test
    public void removeTagsTest() {
        Safelist safelist = new Safelist();
        safelist.addTags("tag1", "tag2");
        safelist.removeTags("tag1");
        Assert.assertFalse(safelist.isSafeTag("tag1"));
        Assert.assertTrue(safelist.isSafeTag("tag2"));
    }

    @Test
    public void copyConstructorTest() {
        Safelist safelistOrig = new Safelist();
        safelistOrig.addTags("tag1", "tag2");
        Safelist safelistCopy = new Safelist(safelistOrig);
        Assert.assertTrue(safelistCopy.isSafeTag("tag1"));
        Assert.assertTrue(safelistCopy.isSafeTag("tag2"));
    }

    @Test
    public void addAttributesTest() {
        Safelist safelist = new Safelist();
        safelist.addTags("tag1");
        safelist.addAttributes("tag1", "attr1", "attr2");
        Element element = new Element("tag1");
        element.attr("attr1", "value");
        Assert.assertTrue(safelist.isSafeAttribute("tag1", element, new Attribute("attr1", "value")));
    }

    @Test
    public void removeAttributesTest() {
        Safelist safelist = new Safelist();
        safelist.addTags("tag1");
        safelist.addAttributes("tag1", "attr1");
        safelist.removeAttributes("tag1", "attr1");
        Element element = new Element("tag1");
        element.attr("attr1", "value");
        Assert.assertFalse(safelist.isSafeAttribute("tag1", element, new Attribute("attr1", "value")));
    }

    @Test
    public void addEnforcedAttributeTest() {
        Safelist safelist = new Safelist();
        safelist.addTags("tag1");
        safelist.addEnforcedAttribute("tag1", "attr1", "val1");
        Assert.assertEquals(1, safelist.getEnforcedAttributes("tag1").size());
    }

    @Test
    public void removeEnforcedAttributeTest() {
        Safelist safelist = new Safelist();
        safelist.addTags("tag1");
        safelist.addEnforcedAttribute("tag1", "attr1", "val1");
        safelist.removeEnforcedAttribute("tag1", "attr1");
        Assert.assertEquals(0, safelist.getEnforcedAttributes("tag1").size());
    }

    @Test
    public void preserveRelativeLinksTest() {
        Safelist safelist = new Safelist();
        safelist.preserveRelativeLinks(true);
        safelist.addTags("a");
        safelist.addAttributes("a", "href");
        Element element = new Element("a");
        element.attr("href", "./relative/url");
        Assert.assertTrue(safelist.isSafeAttribute("a", element, new Attribute("href", "./relative/url")));
    }

}