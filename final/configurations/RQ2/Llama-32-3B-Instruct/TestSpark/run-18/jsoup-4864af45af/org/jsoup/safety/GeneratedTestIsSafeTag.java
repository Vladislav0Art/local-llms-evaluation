package org.jsoup.safety;

public class GeneratedTestIsSafeTag {

    @Mock
    private Set<String> safelistSet;

    @Mock
    private Attributes attributes;

    @Before
    public void setup() {
        when(attributes.toString()).thenReturn("{}");
    }

    @Test
    public void testIsSafeTag() {
        boolean result = Safelist.basic().isSafeTag("a");
        assertTrue(result);
    }

}