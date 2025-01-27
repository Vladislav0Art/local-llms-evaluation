package org.jsoup.safety;

public class GeneratedTestAddEnforcedAttributeSafelist {

    @Mock
    private Set<String> safelistSet;

    @Mock
    private Attributes attributes;

    @Before
    public void setup() {
        when(attributes.toString()).thenReturn("{}");
    }

    @Test
    public void testAddEnforcedAttributeSafelist() {
        Safelist safelist = Safelist.addEnforcedAttribute("img", "alt", "image alt");
        assertNotNull(safelist.getEnforcedAttributes("img").toString());
    }

}