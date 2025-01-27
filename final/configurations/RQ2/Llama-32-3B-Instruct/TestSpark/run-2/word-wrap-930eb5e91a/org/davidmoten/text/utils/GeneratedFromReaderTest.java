package org.davidmoten.text.utils;

import java.nio.charset.StandardCharsets;
import java.util.function.Consumer;

public class GeneratedFromReaderTest {

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

}