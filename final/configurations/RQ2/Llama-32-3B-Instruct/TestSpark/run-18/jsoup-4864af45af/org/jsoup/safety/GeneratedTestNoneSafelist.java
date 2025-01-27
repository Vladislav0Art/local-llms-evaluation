package org.jsoup.safety;

public class GeneratedTestNoneSafelist {

    @Mock
    private Set<String> safelistSet;

    @Mock
    private Attributes attributes;

    @Before
    public void setup() {
        when(attributes.toString()).thenReturn("{}");
    }

    @Test
    public void testNoneSafelist() {
        Safelist safelist = Safelist.none();
        assertNotNull(safelist);
    }

}