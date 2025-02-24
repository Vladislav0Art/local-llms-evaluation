package org.jsoup.safety;

public class GeneratedConstructorTest {

    @Test
    public void constructorTest() {
        Safelist original = Safelist.none();
        Safelist copy = new Safelist(original);
        assertEquals(original, copy);
    }

}