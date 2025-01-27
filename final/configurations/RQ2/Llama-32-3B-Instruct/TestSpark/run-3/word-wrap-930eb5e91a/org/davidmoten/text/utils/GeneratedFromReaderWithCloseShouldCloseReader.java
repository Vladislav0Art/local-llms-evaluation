package org.davidmoten.text.utils;

public class GeneratedFromReaderWithCloseShouldCloseReader {

    @Test
    public void fromReaderWithCloseShouldCloseReader() {
        WordWrap.Builder builder = WordWrap.from(new String[]{"Hello", "World"}, true);
        assertTrue(WordWrap.close(builder.reader()));
    }

}