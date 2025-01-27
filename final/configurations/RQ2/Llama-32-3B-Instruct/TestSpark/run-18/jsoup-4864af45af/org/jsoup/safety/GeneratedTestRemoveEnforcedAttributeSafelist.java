package org.jsoup.safety;

public class GeneratedTestRemoveEnforcedAttributeSafelist {

    @Mock
    private Set<String> safelistSet;

    @Mock
    private Attributes attributes;

    @Before
    public void setup() {
        when(attributes.toString()).thenReturn("{}");
    }

    @Test
    public void testRemoveEnforcedAttributeSafelist() {
        Safelist safelist = Safelist.addEnforcedAttribute("img", "alt", "image alt").removeEnforcedAttribute("img", "alt");
        assertTrue(safelist.isSafeAttribute("img", null, null));
    }

}