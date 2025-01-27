package org.jsoup.safety;

public class GeneratedTestAddProtocolsSafelist {

    @Mock
    private Set<String> safelistSet;

    @Mock
    private Attributes attributes;

    @Before
    public void setup() {
        when(attributes.toString()).thenReturn("{}");
    }

    @Test
    public void testAddProtocolsSafelist() {
        Safelist safelist = Safelist.addProtocols("img", "src", "http://example.com");
        assertNotNull(safelist.getEnforcedAttributes("img").toString());
    }

}