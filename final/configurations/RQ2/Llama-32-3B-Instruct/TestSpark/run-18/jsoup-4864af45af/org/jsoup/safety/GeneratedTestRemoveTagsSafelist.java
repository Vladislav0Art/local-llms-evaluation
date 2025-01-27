package org.jsoup.safety;

public class GeneratedTestRemoveTagsSafelist {

    @Mock
    private Set<String> safelistSet;

    @Mock
    private Attributes attributes;

    @Before
    public void setup() {
        when(attributes.toString()).thenReturn("{}");
    }

    @Test
    public void testRemoveTagsSafelist() {
        Safelist safelist = Safelist.addTags("script").removeTags("script");
        assertFalse(safelist.isSafeTag("script"));
    }

}