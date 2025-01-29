package org.jsoup.safety;

public class GeneratedTest {

    @Test
    public void simpleTextIsSafe() {
        Safelist safelist = Safelist.simpleText();
        Assert.assertTrue(safelist.isSafeTag("a"));
        Assert.assertFalse(safelist.isSafeAttribute("a", "src"));
    }

    @Test
    public void basicIsSafe() {
        Safelist safelist = Safelist.basic();
        Assert.assertTrue(safelist.isSafeTag("a"));
        Assert.assertFalse(safelist.isSafeAttribute("a", "href"));
    }

    @Test
    public void basicWithImagesIsSafe() {
        Safelist safelist = Safelist.basicWithImages();
        Assert.assertTrue(safelist.isSafeTag("img"));
        Assert.assertFalse(safelist.isSafeAttribute("img", "src"));
    }

    @Test
    public void relaxedIsSafe() {
        Safelist safelist = Safelist.relaxed();
        Assert.assertTrue(safelist.isSafeTag("a"));
        Assert.assertTrue(safelist.isSafeAttribute("a", "href"));
        Assert.assertFalse(safelist.isSafeAttribute("a", "src"));
        Assert.assertFalse(safelist.isSafeAttribute("a", "title"));
    }

    @Test
    public void relaxedWithImagesIsSafe() {
        Safelist safelist = Safelist.relaxedWithImages();
        Assert.assertTrue(safelist.isSafeTag("img"));
        Assert.assertTrue(safelist.isSafeAttribute("img", "src"));
        Assert.assertFalse(safelist.isSafeAttribute("img", "href"));
    }

    @Test
    public void noneIsSafe() {
        Safelist safelist = Safelist.none();
        Assert.assertTrue(safelist.isSafeTag("a"));
        Assert.assertFalse(safelist.isSafeAttribute("a", "src"));
    }

    @Test
    public void basicWithImagesPreservesLinksIsSafe() {
        Safelist safelist = Safelist.basicWithImages().preserveRelativeLinks(true);
        Assert.assertTrue(safelist.isSafeTag("a"));
        Assert.assertFalse(safelist.isSafeAttribute("a", "href"));
        Assert.assertTrue(safelist.isSafeAttribute("img", "src"));
    }

    @Test
    public void relaxedWithImagesPreservesLinksIsSafe() {
        Safelist safelist = Safelist.relaxed().preserveRelativeLinks(true);
        Assert.assertTrue(safelist.isSafeTag("a"));
        Assert.assertFalse(safelist.isSafeAttribute("a", "href"));
        Assert.assertTrue(safelist.isSafeAttribute("img", "src"));
    }

    @Test
    public void nonePreservesLinksIsSafe() {
        Safelist safelist = Safelist.none().preserveRelativeLinks(true);
        Assert.assertTrue(safelist.isSafeTag("a"));
        Assert.assertFalse(safelist.isSafeAttribute("a", "href"));
        Assert.assertFalse(safelist.isSafeAttribute("img", "src"));
    }

    @Test
    public void nonePreservesAttributesIsSafe() {
        Safelist safelist = Safelist.none().preserveRelativeLinks(true);
        Safelist safelistCopy = new Safelist();
        safelistCopy.addAttributes("a", "href");
        Assert.assertTrue(safelist.isSafeAttribute("a", "href"));
        Assert.assertFalse(safelistCopy.isSafeAttribute("a", "href"));
    }

}