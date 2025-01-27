package org.jsoup.safety;

public class GeneratedTestIsSafeAttribute {

    @Mock
    private Set<String> safelistSet;

    @Mock
    private Attributes attributes;

    @Before
    public void setup() {
        when(attributes.toString()).thenReturn("{}");
    }

    @Test
    public void testIsSafeAttribute() {
        Safelist safelist = Safelist.addAttributes("img", "alt", "image alt").addEnforcedAttribute("img", "alt", "image alt");
        boolean result = Safelist.basic().isSafeAttribute("img", null, attributes);
        assertTrue(result);
    }

}