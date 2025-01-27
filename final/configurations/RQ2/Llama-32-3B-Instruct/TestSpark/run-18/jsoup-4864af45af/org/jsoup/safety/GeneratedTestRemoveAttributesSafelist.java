package org.jsoup.safety;

public class GeneratedTestRemoveAttributesSafelist {

    @Mock
    private Set<String> safelistSet;

    @Mock
    private Attributes attributes;

    @Before
    public void setup() {
        when(attributes.toString()).thenReturn("{}");
    }

    @Test
    public void testRemoveAttributesSafelist() {
        Safelist safelist = Safelist.addAttributes("img", "alt", "image alt").removeAttributes("img", "alt");
        assertTrue(safelist.isSafeAttribute("img", null, null));
    }

}