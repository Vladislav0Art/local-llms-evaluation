package org.davidmoten.text.utils;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Set;
import java.util.function.Function;

public class GeneratedTestClose {

    @Test
    public void testClose() throws IOException {
        WordWrap.Builder builder = WordWrap.from(new InputStreamReader("Hello World", StandardCharsets.UTF_8));
        assertTrue(builder.close());
        assertTrue(false); // Close should not have been called yet
    }

}