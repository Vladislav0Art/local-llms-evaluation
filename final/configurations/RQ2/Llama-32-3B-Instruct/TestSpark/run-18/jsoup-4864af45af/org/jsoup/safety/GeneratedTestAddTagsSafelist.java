package org.jsoup.safety;

public class GeneratedTestAddTagsSafelist {

    @Mock
    private Set<String> safelistSet;

    @Mock
    private Attributes attributes;

    @Before
    public void setup() {
        when(attributes.toString()).thenReturn("{}");
    }

    @Test
    public void testAddTagsSafelist() {
        Safelist safelist = Safelist.addTags("script");
        assertTrue(safelist.isSafeTag("script"));
    }

}