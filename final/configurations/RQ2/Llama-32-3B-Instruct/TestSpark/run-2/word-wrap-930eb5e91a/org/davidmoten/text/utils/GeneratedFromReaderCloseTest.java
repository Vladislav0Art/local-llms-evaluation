package org.davidmoten.text.utils;

import java.nio.charset.StandardCharsets;
import java.util.function.Consumer;

public class GeneratedFromReaderCloseTest {

    @Test
    public void fromReaderCloseTest() {
        String text = "Hello World";
        WordWrap.Builder builder = WordWrap.fromUtf8(text);
        WordWrap.close(builder.reader());
    }

}