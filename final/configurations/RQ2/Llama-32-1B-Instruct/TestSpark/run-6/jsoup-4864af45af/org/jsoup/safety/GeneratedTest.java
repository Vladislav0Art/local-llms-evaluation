package org.jsoup.safety;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Attribute;

import static org.jsoup.internal.Normalizer.lowerCase;

public class GeneratedTest {

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
    public void testNone() {
        Safelist none = new Safelist().none();
        assertEquals("none", none.none());
    }

    @Test
    public void testSimpleText() {
        Safelist simpleText = new Safelist().simpleText();
        assertFalse(simpleText.isSafeTag("a"));
    }

    @Test
    public void testBasic() {
        Safelist basic = new Safelist().basic();
        assertFalse(basic.isSafeTag("a"));
    }

    @Test
    public void testBasicWithImages() {
        Safelist basicWithImages = new Safelist().basicWithImages();
        assertFalse(basicWithImages.isSafeTag("img"));
    }

    @Test
    public void testRelaxed() {
        Safelist relaxed = new Safelist().relaxed();
        assertTrue(relaxed.isSafeTag("a"));
    }

    @Test
    public void testPreserveRelativeLinks() {
        Safelist preserveRelativeLinks = new Safelist().preserveRelativeLinks(true);
        assertFalse(preserveRelativeLinks.isSafeTag("img[src='https://example.com/image.jpg']"));
    }

    @Test
    public void testAddProtocols() {
        Safelist addProtocols = new Safelist().addProtocols("a", "class");
        assertTrue(addProtocols.addEnforcedAttribute("a", "class", "text-decoration").isSafeTag("a"));
    }

    @Test
    public void testRemoveProtocols() {
        Safelist removeProtocols = new Safelist().removeProtocols("img[src='https://example.com/image.jpg']");
        assertFalse(removeProtocols.removeAttribute("src").isSafeTag("img"));
    }

    @Test
    public void testAddAttributes() {
        Safelist addAttributes = new Safelist().addAttributes("a", "style=\"background-color: blue\"");
        assertTrue(addAttributes.addEnforcedAttribute("a", "style", "background-color").isSafeTag("a"));
    }

    @Test
    public void testRemoveAttributes() {
        Safelist removeAttributes = new Safelist().removeAttributes("img[src='https://example.com/image.jpg']");
        assertFalse(removeAttributes.removeAttribute("src").isSafeTag("img"));
    }

    @Test
    public void testCopy() {
        Safelist copy = new Safelist();
        assertTrue(copy.copy().none());
    }

    @Test
    public void testRemoveAttribute() {
        Safelist removeAttribute = new Safelist();
        Attributes attributes = removeAttribute.removeAttribute("src");
        assertEquals("src", attributes.getKey());
        assertTrue(removeAttribute.isSafeTag("img"));
    }

    @Test
    public void testRemoveAttributeAllAttributes() {
        Safelist removeAttributeAllAttributes = new Safelist();
        removeAttributeAllAttributes.removeAttribute("src").removeAttribute("class");
        assertFalse(removeAttributeAllAttributes.isSafeTag("img"));
    }

}