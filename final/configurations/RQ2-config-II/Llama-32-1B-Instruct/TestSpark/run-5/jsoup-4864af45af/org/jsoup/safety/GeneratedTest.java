package org.jsoup.safety;

import org.junit.jupiter.api.Test;
import org.jsoup.safety.Safelist;
import org.jsoup.helper.Validate;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Element;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;

public class GeneratedTest {

    @Test
    public void testNone_SafeList() {
        Safelist safeList = Safelist.none();
        assertTrue(safeList.isSafeTag("img"));
        assertTrue(safeList.isSafeTag("script"));
        assertFalse(safeList.isSafeTag("pre"));
    }

    @Test
    public void testSimpleText_SafeList() {
        Safelist safeList = Safelist.simpleText();
        assertTrue(safeList.isSafeAttribute("style", "color: red;"));
        assertFalse(safeList.isSafeAttribute("script", "red;"));
    }

    @Test
    public void testBasic_SafeList() {
        Safelist safeList = Safelist.basic();
        assertTrue(safeList.isSafeTag("a"));
        assertTrue(safeList.isSafeAttribute("href", "https://www.example.com"));
    }

    @Test
    public void testBasicWithImages_SafeList() {
        Safelist safeList = Safelist.basicWithImages();
        assertTrue(safeList.isSafeTag("img"));
        assertTrue(safeList.isSafeAttribute("src", "image.jpg"));
    }

    @Test
    public void testRelaxed_SafeList() {
        Safelist safeList = Safelist.relaxed();
        assertTrue(safeList.isSafeTag("a"));
        assertFalse(safeList.isSafeAttribute("href", ""));
    }

    @Test
    public void testSafelistCopy_SafeList() {
        Safelist safeList = Safelist.none();
        Safelist copy = new Safelist(safeList);
        assertTrue(copy.isSafeTag("img"));
        assertTrue(copy.isSafeAttribute("style", "color: red;"));
        assertFalse(copy.isSafeAttribute("script", "red;"));
    }

    @Test
    public void testAddTags_Safelist() {
        Safelist safeList = new Safelist();
        safeList.addTags("a", "b", "c");
        assertTrue(safeList.isSafeTag("a"));
        assertTrue(safeList.isSafeTag("b"));
        assertTrue(safeList.isSafeTag("c"));
    }

    @Test
    public void testRemoveTags_Safelist() {
        Safelist safeList = new Safelist();
        safeList.removeTags("a", "b");
        assertFalse(safeList.isSafeTag("a"));
        assertFalse(safeList.isSafeTag("b"));
    }

    @Test
    public void testAddAttributes_Safelist() {
        Safelist safeList = new Safelist();
        safeList.addAttributes("style", "color: red; background-color: blue;");
        assertTrue(safeList.getEnforcedAttributes("style").size() == 1);
        assertTrue(safeList.getEnforcedAttributes("background-color").size() == 1);
    }

    @Test
    public void testRemoveAttributes_Safelist() {
        Safelist safeList = new Safelist();
        safeList.removeAttributes("style", "color: red; background-color: blue;");
        assertFalse(safeList.isSafeAttribute("style", "color: red;"));
        assertFalse(safeList.isSafeAttribute("background-color", "blue;"));
    }

    @Test
    public void testAddEnforcedAttribute_Safelist() {
        Safelist safeList = new Safelist();
        safeList.addEnforcedAttribute("a", "href", "https://www.example.com");
        assertTrue(safeList.isSafeAttribute("a", "href", "https://www.example.com"));
    }

    @Test
    public void testRemoveEnforcedAttribute_Safelist() {
        Safelist safeList = new Safelist();
        safeList.removeEnforcedAttribute("a", "href");
        assertFalse(safeList.isSafeAttribute("a", "href"));
    }

    @Test
    public void testPreserveRelativeLinks_Safelist() {
        Safelist safeList = new Safelist();
        safeList.preserveRelativeLinks(true);
        assertTrue(safeList.isSafeTag("a href=\"https://www.example.com\""));
    }

    @Test
    public void testAddProtocols_Safelist() {
        Safelist safeList = new Safelist();
        safeList.addProtocols("a", "rel", "stylesheet");
        assertTrue(safeList.isSafeAttribute("style", "color: red; background-color: blue; rel=stylesheet"));
    }

    @Test
    public void testRemoveProtocols_Safelist() {
        Safelist safeList = new Safelist();
        safeList.removeProtocols("a", "rel");
        assertFalse(safeList.isSafeAttribute("style", "color: red; background-color: blue; rel=stylesheet"));
    }

}