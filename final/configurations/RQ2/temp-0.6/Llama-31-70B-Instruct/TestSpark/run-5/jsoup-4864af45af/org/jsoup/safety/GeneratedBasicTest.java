package org.jsoup.safety;

public class GeneratedBasicTest {

    private Safelist safelist;

    @Before
    public void setUp() {
        safelist = new Safelist();
    }

    @Test
    public void basicTest() {
        Safelist basic = Safelist.basic();
        assertEquals(basic.getTags().size(), 6);
        assertEquals(basic.getTags().get(0), "a");
        assertEquals(basic.getTags().get(1), "p");
        assertEquals(basic.getTags().get(2), "br");
        assertEquals(basic.getTags().get(3), "div");
        assertEquals(basic.getTags().get(4), "img");
        assertEquals(basic.getTags().get(5), "span");
    }

}