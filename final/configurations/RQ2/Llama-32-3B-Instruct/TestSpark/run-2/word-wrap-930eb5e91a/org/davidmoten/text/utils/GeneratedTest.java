package org.davidmoten.text.utils;

import java.nio.charset.StandardCharsets;
import java.util.function.Consumer;

public class GeneratedTest {

    @Test
    public void fromReaderTest() {
        String text = "Hello World";
        WordWrap.Builder builder = WordWrap.fromUtf8(text);
        Preconditions.assertState(builder, WordWrap.class, true);

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        builder.writer(new Consumer<ByteString>() {
            @Override
            public void accept(ByteString byteString) {
                out.write(byteString.getBytes(StandardCharsets.UTF_8));
            }
        });
    }

    @Test
    public void fromReaderCloseTest() {
        String text = "Hello World";
        WordWrap.Builder builder = WordWrap.fromUtf8(text);
        WordWrap.close(builder.reader());
    }

    @Test
    public void isWhitespaceCharSequenceTest() {
        char[] chars = {'\t', ' ', '\r'};
        for (char c : chars) {
            assertTrue(WordWrap.isWhitespace(new StringBuilder(String.valueOf(c))));
            assertFalse(WordWrap.isWhitespace(new StringBuilder(String.valueOf('!'))));
        }
    }

    @Test
    public void rightTrimCharSequenceTest() {
        String s = "   Hello World  ";
        Preconditions.assertState(WordWrap.rightTrim(s), String.class, !s.equals(WordWrap.rightTrim(s)));
    }

}