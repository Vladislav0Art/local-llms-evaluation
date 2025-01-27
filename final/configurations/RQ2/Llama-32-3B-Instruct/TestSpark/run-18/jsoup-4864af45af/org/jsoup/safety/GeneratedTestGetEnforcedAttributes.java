package org.jsoup.safety;

public class GeneratedTestGetEnforcedAttributes {

    @Mock
    private Set<String> safelistSet;

    @Mock
    private Attributes attributes;

    @Before
    public void setup() {
        when(attributes.toString()).thenReturn("{}");
    }

    @Test
    public void testGetEnforcedAttributes() {
        Safelist safelist = Safelist.addAttributes("img", "alt", "image alt").addEnforcedAttribute("img", "alt", "image alt");
        assertNotNull(safelist.getEnforcedAttributes("img"));
    }

}