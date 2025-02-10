package org.davidmoten.text.utils;

public class GeneratedFromCharSequenceTest {

    @Test
    public void fromCharSequenceTest() {
        String text = "This is a test.";
        assertTrue(WordWrap.from(text).isPresent());
    }

}