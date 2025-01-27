package org.jsoup.safety;

public class GeneratedTestSimpleTextSafelist {

    @Mock
    private Set<String> safelistSet;

    @Mock
    private Attributes attributes;

    @Before
    public void setup() {
        when(attributes.toString()).thenReturn("{}");
    }

    @Test
    public void testSimpleTextSafelist() {
        Safelist safelist = Safelist.simpleText();
        assertSame(attributes, safelist.getEnforcedAttributes("script"));
    }

}