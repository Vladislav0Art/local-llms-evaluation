package org.jsoup.safety;

public class GeneratedSimpleTextTest {

    private Safelist safelist;

    @Before
    public void setUp() {
        safelist = new Safelist();
    }

    @Test
    public void simpleTextTest() {
        Safelist simpleText = Safelist.simpleText();
        assertEquals(simpleText.getTags().size(), 2);
        assertEquals(simpleText.getTags().get(0), "p");
        assertEquals(simpleText.getTags().get(1), "br");
    }

}