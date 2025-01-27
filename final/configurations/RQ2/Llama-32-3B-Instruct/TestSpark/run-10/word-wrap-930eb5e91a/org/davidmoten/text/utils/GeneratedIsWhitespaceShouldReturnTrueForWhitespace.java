package org.davidmoten.text.utils;

public class GeneratedIsWhitespaceShouldReturnTrueForWhitespace {

    @Test
    public void isWhitespaceShouldReturnTrueForWhitespace() {
        try (WordWraper wordWraper = new WordWraper(20, true)) {
            boolean result = wordWraper.isWhitespace(' ');
            Assert.assertTrue(result);
        } catch (Exception e) {
            fail("Expected no exception");
        }
    }

}