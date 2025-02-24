package org.jsoup.safety;

public class GeneratedNoneTest {

    private Safelist safelist;

    @Before
    public void setUp() {
        safelist = new Safelist();
    }

    @Test
    public void noneTest() {
        Safelist none = Safelist.none();
        assertEquals(none.isEmpty(), true);
    }

}