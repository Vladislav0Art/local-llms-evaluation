package org.jsoup.safety;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class GeneratedTest {

    private Document document;

    @Test
    public void simpleText_SafeList() {
        Safelist list = Safelist.none();
        Assert.assertTrue(list.isSafeTag("a"));
        Assert.assertFalse(list.isSafeTag("p"));
        Assert.assertFalse(list.isSafeTag(""));
        document = Safelist.getDocument(list);
    }

    @Test
    public void basic_Safelist() {
        Safelist list = Safelist.basic();
        List<String> tags = new ArrayList<>();
        tags.add("a", "href=\"https://example.com\"");
        Assert.assertTrue(list.isSafeTag(tags));
        document = Safelist.getDocument(list);
    }

    @Test
    public void relaxed_Safelist() {
        Safelist list = Safelist.relaxed();
        List<String> tags = new ArrayList<>();
        tags.add("img", "src=\"image.jpg\"");
        Assert.assertTrue(list.isSafeTag(tags));
        document = Safelist.getDocument(list);
    }

    @Test
    public void basicWithImages_Safelist() {
        Safelist list = Safelist.basicWithImages();
        List<String> tags = new ArrayList<>();
        tags.add("a", "href=\"https://example.com\"");
        Assert.assertTrue(list.isSafeTag(tags));
        document = Safelist.getDocument(list);
    }

    @Test
    public void addProtocols_Safelist() {
        Safelist list = Safelist.preserveRelativeLinks(true);
        List<String> tags = new ArrayList<>();
        tags.add("a", "href=\"https://example.com\"");
        Assert.assertTrue(list.isSafeTag(tags));
        document = Safelist.getDocument(list);
    }

    @Test
    public void removeProtocols_Safelist() {
        Safelist list = Safelist.preserveRelativeLinks(false);
        List<String> tags = new ArrayList<>();
        tags.add("a", "href=\"https://example.com\"");
        Assert.assertFalse(list.isSafeTag(tags));
        document = Safelist.getDocument(list);
    }

    @Test
    public void addEnforcedAttribute_Safelist() {
        Safelist list = Safelist.preserveRelativeLinks(true);
        List<String> tags = new ArrayList<>();
        tags.add("a", "href=\"https://example.com\"");
        Assert.assertTrue(list.isSafeTag(tags, true));
        document = Safelist.getDocument(list);
    }

    @Test
    public void removeEnforcedAttribute_Safelist() {
        Safelist list = Safelist.preserveRelativeLinks(false);
        List<String> tags = new ArrayList<>();
        tags.add("a", "href=\"https://example.com\"");
        Assert.assertFalse(list.isSafeTag(tags, false));
        document = Safelist.getDocument(list);
    }

    @Test
    public void preserveRelativeLinks_Safelist() {
        Safelist list = Safelist.preserveRelativeLinks(true);
        List<String> tags = new ArrayList<>();
        tags.add("a", "href=\"https://example.com\"");
        Assert.assertTrue(list.isSafeTag(tags));
        document = Safelist.getDocument(list);
    }

    @Test
    public void addProtocols_Safelist() {
        Safelist list = Safelist.preserveRelativeLinks(true);
        List<String> tags = new ArrayList<>();
        tags.add("a", "href=\"https://example.com\"");
        Assert.assertTrue(list.isSafeTag(tags, true));
        document = Safelist.getDocument(list);
    }

    @Test
    public void removeProtocols_Safelist() {
        Safelist list = Safelist.preserveRelativeLinks(false);
        List<String> tags = new ArrayList<>();
        tags.add("a", "href=\"https://example.com\"");
        Assert.assertFalse(list.isSafeTag(tags, false));
        document = Safelist.getDocument(list);
    }

    private Document getDocument(Safelist list) {
        return Jsoup.parse(Jsoup.append("html", "<body><p>Hello World!</p></body>").text(), list);
    }

}