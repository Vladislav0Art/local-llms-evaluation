package org.jsoup.safety;

public class GeneratedTestRemoveProtocolsSafelist {

    @Mock
    private Set<String> safelistSet;

    @Mock
    private Attributes attributes;

    @Before
    public void setup() {
        when(attributes.toString()).thenReturn("{}");
    }

    @Test
    public void testRemoveProtocolsSafelist() {
        Safelist safelist = Safelist.addProtocols("img", "src", "http://example.com").removeProtocols("img", "src", "http://example.com");
        assertTrue(safelist.isSafeAttribute("img", null, null));
    }

}