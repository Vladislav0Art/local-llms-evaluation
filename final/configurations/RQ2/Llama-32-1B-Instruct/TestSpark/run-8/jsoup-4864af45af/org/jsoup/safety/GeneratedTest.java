package org.jsoup.safety;

import org.junit.jupiter.api.Test;
import org.jsoup.nodes.Document;
import org.mockito.Mockito;

import static org.jsoup.safety.Safelist.*;

public class GeneratedTest {

    @Test
    public void none_() {
        Document document = new Document();
        Safelist safeList = none();
        Assertions.assertTrue(safeList.isSafeTag("a"));
    }

    @Test
    public void simpleText() {
        Safelist safeList = simpleText();
        Document document = new Document();
        document.append("<a href=\"#\">Click me</a>");
        Assertions.assertTrue(safeList.isSafeTag("a"));
    }

    @Test
    public void basic_() {
        Safelist safeList = basic();
        Document document = new Document();
        document.append("<a href=\"#\">Click me</a><img src=\"image.jpg\" alt=\"Image\"></a>");
        Assertions.assertTrue(safeList.isSafeTag("a") && safeList.isSafeTag("img"));
    }

    @Test
    public void basicWithImages_() {
        Safelist safeList = basicWithImages();
        Document document = new Document();
        document.append("<a href=\"#\">Click me</a><img src=\"image.jpg\" alt=\"Image\"></a>");
        Assertions.assertTrue(safeList.isSafeTag("a") && safeList.isSafeTag("img"));
    }

    @Test
    public void relaxed_() {
        Safelist safeList = relaxed();
        Document document = new Document();
        document.append("<a href=\"#\">Click me</a><img src=\"image.jpg\" alt=\"Image\"></a>");
        Assertions.assertTrue(safeList.isSafeTag("a"));
    }

    @Test
    public void copy_() {
        Safelist safeList1 = none();
        Safelist safeList2 = safeList1.copy();
        Document document = new Document();
        document.append("<a href=\"#\">Click me</a>");
        Assertions.assertTrue(safeList1.isSafeTag("a"));
        Assertions.assertFalse(safeList2.isSafeTag("a"));
    }

    @Test
    public void addTags_() {
        Safelist safeList = none();
        safeList.addTags("span", "class=\"test\"");
        Document document = new Document();
        document.append("<a href=\"#\">Click me</a><span class=\"test\"></span>");
        Assertions.assertTrue(safeList.isSafeTag("span"));
    }

    @Test
    public void removeTags_() {
        Safelist safeList = none();
        safeList.removeTags("span");
        Document document = new Document();
        document.append("<a href=\"#\">Click me</a><span class=\"test\"></span>");
        Assertions.assertFalse(safeList.isSafeTag("span"));
    }

    @Test
    public void addAttributes_() {
        Safelist safeList = none();
        safeList.addAttributes("a", "href=\"https://example.com\"");
        Document document = new Document();
        document.append("<a href=\"#\">Click me</a>");
        Assertions.assertTrue(safeList.isSafeAttribute("a", "href"));
    }

    @Test
    public void removeAttributes_() {
        Safelist safeList = none();
        safeList.removeAttributes("a");
        Document document = new Document();
        document.append("<a href=\"#\">Click me</a>");
        Assertions.assertFalse(safeList.isSafeAttribute("a", "href"));
    }

    @Test
    public void addEnforcedAttribute_() {
        Safelist safeList = none();
        safeList.addEnforcedAttribute("span", "class=\"test\"", "");
        Document document = new Document();
        document.append("<a href=\"#\">Click me</a><span class=\"test\"></span>");
        Assertions.assertTrue(safeList.isSafeAttribute("span", "class"));
    }

    @Test
    public void removeEnforcedAttribute_() {
        Safelist safeList = none();
        safeList.removeEnforcedAttribute("span", "");
        Document document = new Document();
        document.append("<a href=\"#\">Click me</a><span class=\"test\"></span>");
        Assertions.assertFalse(safeList.isSafeAttribute("span", "class"));
    }

    @Test
    public void preserveRelativeLinks_() {
        Safelist safeList = none();
        safeList.preserveRelativeLinks(true);
        Document document = new Document();
        document.append("<a href=\"#\">Click me</a>");
        Assertions.assertTrue(safeList.isSafeTag("a"));
    }

    @Test
    public void addProtocols_() {
        Safelist safeList = none();
        safeList.addProtocols("img", "src=\"image.jpg\"");
        Document document = new Document();
        document.append("<a href=\"#\"><img src=\"image.jpg\" alt=\"Image\"></a>");
        Assertions.assertTrue(safeList.isSafeTag("img"));
    }

    @Test
    public void removeProtocols_() {
        Safelist safeList = none();
        safeList.removeProtocols("img");
        Document document = new Document();
        document.append("<a href=\"#\"><img src=\"image.jpg\" alt=\"Image\"></a>");
        Assertions.assertFalse(safeList.isSafeTag("img"));
    }

}