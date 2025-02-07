package org.jsoup.safety;

public class GeneratedTest {

    @Test
    public void testNone() {
        Safelist none = new Safelist();
        assertEquals(org.jsoup.safety.Safelist.none(), none);
    }

    @Test
    public void testSimpleText() throws Exception {
        Safelist simpleText = Safelist.simpleText();
        assertNotNull(simpleText);
        assertTrue(simpleText.isSafeTag("a"));
        assertFalse(simpleText.isSafeTag("script"));
    }

    @Test
    public void testBasic() throws Exception {
        Safelist basic = Safelist.basic();
        assertNotNull(basic);
        assertTrue(basic.isSafeTag("p"));
        assertFalse(basic.isSafeTag("img"));
    }

    @Test
    public void testBasicWithImages() throws Exception {
        Safelist basicWithImages = Safelist.basicWithImages();
        assertNotNull(basicWithImages);
        assertTrue(basicWithImages.isSafeTag("img"));
        assertFalse(basicWithImages.isSafeTag("p"));
    }

    @Test
    public void testRelaxed() throws Exception {
        Safelist relaxed = Safelist.relativelySane();
        assertNotNull(relaxed);
        assertTrue(relaxed.isSafeTag("a"));
        assertTrue(relaxed.isSafeTag("img"));
    }

    @Test
    public void testEnforcedAttribute() throws Exception {
        Safelist enforcedAttribute = Safelist.enforcedAttribute("a", "class", "");
        assertTrue(enforcedAttribute.hasAttribute("class"));
    }

    @Test
    public void testRemoveAttribute() throws Exception {
        Safelist removeAttribute = Safelist.removeAttributes("img");
        assertEquals(org.jsoup.safety.Safelist.NONE, removeAttribute);
    }

    @Test
    public void testAddEnforcedAttribute() throws Exception {
        Safelist addEnforcedAttribute = new Safelist();
        addEnforcedAttribute.addEnforcedAttribute("a", "class", "");
        assertTrue(addEnforcedAttribute.hasAttribute("class"));
    }

    @Test
    public void testRemoveProtocols() throws Exception {
        Safelist removeProtocols = Safelist.removeProtocols("img");
        assertEquals(org.jsoup.safety.Safelist.NONE, removeProtocols);
    }

}