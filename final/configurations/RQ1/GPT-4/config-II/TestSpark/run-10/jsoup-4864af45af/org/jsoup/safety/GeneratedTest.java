package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.jsoup.safety.Safelist;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedTest {

    @Test
    public void noneTest() {
        Assert.assertEquals(Safelist.none().toString(), new Safelist().toString());
    }

    @Test
    public void simpleTextTest() {
        Assert.assertEquals(Safelist.simpleText().toString(), Safelist.none().addTags("b", "em", "i", "strong", "u").toString());
    }

    @Test
    public void basicTest() {
        Assert.assertEquals(Safelist.basic().toString(), Safelist.none()
                .addTags("a", "b", "blockquote", "br", "cite", "code", "dd", "dl", "dt", "em", "i", "li", "ol", "p", "pre", "q", "small", "span", "strike", "strong", "sub", "sup", "u", "ul")
                .addAttributes("a", "href")
                .addAttributes("blockquote", "cite")
                .addAttributes("q", "cite")
                .addProtocols("a", "href", "ftp", "http", "https", "mailto")
                .addProtocols("blockquote", "cite", "http", "https")
                .addProtocols("cite", "cite", "http", "https")
                .addEnforcedAttribute("a", "rel", "nofollow")
                .toString());
    }

    @Test
    public void basicWithImagesTest() {
        Assert.assertEquals(Safelist.basicWithImages().toString(), Safelist.basic()
                .addTags("img")
                .addAttributes("img", "align", "alt", "height", "src", "title", "width")
                .addProtocols("img", "src", "http", "https")
                .toString());
    }

    @Test
    public void relaxedTest() {
        Assert.assertEquals(Safelist.relaxed().toString(), Safelist.none()
                .addTags("a", "b", "blockquote", "br", "caption", "cite", "code", "col", "colgroup", "dd", "div", "dl", "dt", "em", "h1", "h2", "h3", "h4", "h5", "h6", "i", "img", "li", "ol", "p", "pre", "q", "small", "span", "strike", "strong", "sub", "sup", "table", "tbody", "td", "tfoot", "th", "thead", "tr", "u", "ul")
                .addAttributes("a", "href", "title")
                .addAttributes("blockquote", "cite")
                .addAttributes("col", "span", "width")
                .addAttributes("colgroup", "span", "width")
                .addAttributes("img", "align", "alt", "height", "src", "title", "width")
                .addAttributes("ol", "start", "type")
                .addAttributes("q", "cite")
                .addAttributes("table", "summary", "width")
                .addAttributes("td", "abbr", "axis", "colspan", "rowspan", "width")
                .addAttributes("th", "abbr", "axis", "colspan", "rowspan", "scope", "width")
                .addAttributes("ul", "type")
                .addProtocols("a", "href", "ftp", "http", "https", "mailto")
                .addProtocols("blockquote", "cite", "http", "https")
                .addProtocols("cite", "cite", "http", "https")
                .addProtocols("img", "src", "http", "https")
                .addProtocols("q", "cite", "http", "https")
                .toString());
    }

    @Test
    public void removeTagsTest() {
        Assert.assertEquals(Safelist.none().removeTags("a", "b").toString(), new Safelist().toString());
    }

    @Test
    public void removeAttributesTest() {
        Assert.assertEquals(Safelist.none().removeAttributes("a", "href", "class").toString(), new Safelist().toString());
    }

    @Test
    public void removeEnforcedAttributeTest() {
        Assert.assertEquals(Safelist.none().removeEnforcedAttribute("a", "rel").toString(), new Safelist().toString());
    }

    @Test
    public void removeProtocolsTest() {
        Assert.assertEquals(Safelist.none().removeProtocols("a", "href", "ftp").toString(), new Safelist().toString());
    }

    @Test
    public void addTagsTest() {
        Assert.assertEquals(Safelist.none().addTags("a", "b").toString(), new Safelist().toString());
    }

    @Test
    public void addAttributesTest() {
        Assert.assertEquals(Safelist.none().addAttributes("a", "href", "class").toString(), new Safelist().toString());
    }

    @Test
    public void addEnforcedAttributeTest() {
        Assert.assertEquals(Safelist.none().addEnforcedAttribute("a", "rel", "nofollow").toString(), new Safelist().toString());
    }

    @Test
    public void addProtocolsTest() {
        Assert.assertEquals(Safelist.none().addProtocols("a", "href", "ftp", "http", "https", "mailto").toString(), new Safelist().toString());
    }

    @Test
    public void isSafeTagTest() {
        Assert.assertEquals(Safelist.none().isSafeTag("a"), false);
    }

    @Test
    public void isSafeAttributeTest() {
        Element mockElement = Mockito.mock(Element.class);
        Mockito.when(mockElement.absUrl("href")).thenReturn("https://www.google.com");
        Attribute testAttribute = new Attribute("href", "https://www.google.com");
        AssertassertEquals(false, Safelist.none().isSafeAttribute("a", mockElement, testAttribute));
    }

    @Test
    public void preserveRelativeLinksTest() {
        Assert.assertEquals(Safelist.none().preserveRelativeLinks(true).toString(), new Safelist().toString());
    }

}