package org.jsoup.safety;

public class GeneratedTest {

    @Mock
    private Set<String> safelistSet;

    @Mock
    private Attributes attributes;

    @Before
    public void setup() {
        when(attributes.toString()).thenReturn("{}");
    }

    @Test
    public void testNoneSafelist() {
        Safelist safelist = Safelist.none();
        assertNotNull(safelist);
    }

    @Test
    public void testSimpleTextSafelist() {
        Safelist safelist = Safelist.simpleText();
        assertSame(attributes, safelist.getEnforcedAttributes("script"));
    }

    @Test
    public void testBasicSafelist() {
        Safelist safelist = Safelist.basic();
        assertTrue(safelist.isSafeTag("img"));
    }

    @Test
    public void testAddTagsSafelist() {
        Safelist safelist = Safelist.addTags("script");
        assertTrue(safelist.isSafeTag("script"));
    }

    @Test
    public void testRemoveTagsSafelist() {
        Safelist safelist = Safelist.addTags("script").removeTags("script");
        assertFalse(safelist.isSafeTag("script"));
    }

    @Test
    public void testAddAttributesSafelist() {
        Safelist safelist = Safelist.addAttributes("img", "alt", "image alt");
        assertNotNull(safelist.getEnforcedAttributes("img").toString());
    }

    @Test
    public void testRemoveAttributesSafelist() {
        Safelist safelist = Safelist.addAttributes("img", "alt", "image alt").removeAttributes("img", "alt");
        assertTrue(safelist.isSafeAttribute("img", null, null));
    }

    @Test
    public void testAddEnforcedAttributeSafelist() {
        Safelist safelist = Safelist.addEnforcedAttribute("img", "alt", "image alt");
        assertNotNull(safelist.getEnforcedAttributes("img").toString());
    }

    @Test
    public void testRemoveEnforcedAttributeSafelist() {
        Safelist safelist = Safelist.addEnforcedAttribute("img", "alt", "image alt").removeEnforcedAttribute("img", "alt");
        assertTrue(safelist.isSafeAttribute("img", null, null));
    }

    @Test
    public void testPreserveRelativeLinksSafelist() {
        Safelist safelist = Safelist.preserveRelativeLinks(true);
        assertTrue(safelist.isSafeTag("a"));
    }

    @Test
    public void testAddProtocolsSafelist() {
        Safelist safelist = Safelist.addProtocols("img", "src", "http://example.com");
        assertNotNull(safelist.getEnforcedAttributes("img").toString());
    }

    @Test
    public void testRemoveProtocolsSafelist() {
        Safelist safelist = Safelist.addProtocols("img", "src", "http://example.com").removeProtocols("img", "src", "http://example.com");
        assertTrue(safelist.isSafeAttribute("img", null, null));
    }

    @Test
    public void testIsSafeTag() {
        boolean result = Safelist.basic().isSafeTag("a");
        assertTrue(result);
    }

    @Test
    public void testIsSafeAttribute() {
        Safelist safelist = Safelist.addAttributes("img", "alt", "image alt").addEnforcedAttribute("img", "alt", "image alt");
        boolean result = Safelist.basic().isSafeAttribute("img", null, attributes);
        assertTrue(result);
    }

    @Test
    public void testGetEnforcedAttributes() {
        Safelist safelist = Safelist.addAttributes("img", "alt", "image alt").addEnforcedAttribute("img", "alt", "image alt");
        assertNotNull(safelist.getEnforcedAttributes("img"));
    }

}