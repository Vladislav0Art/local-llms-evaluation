package org.jsoup.safety;

public class GeneratedTestAddAttributesSafelist {

    @Mock
    private Set<String> safelistSet;

    @Mock
    private Attributes attributes;

    @Before
    public void setup() {
        when(attributes.toString()).thenReturn("{}");
    }

    @Test
    public void testAddAttributesSafelist() {
        Safelist safelist = Safelist.addAttributes("img", "alt", "image alt");
        assertNotNull(safelist.getEnforcedAttributes("img").toString());
    }

}