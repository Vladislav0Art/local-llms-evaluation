package org.davidmoten.text.utils;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Set;
import java.util.function.Function;

public class GeneratedTestWordWrapWithoutTrim {

    @Test
    public void testWordWrapWithoutTrim() throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader("Hello World"));
        WordWrap.Builder builder = WordWrap.fromClasspath("resource", StandardCharsets.UTF_8);
        wordWrap(builder, null, 10, stringWidth, null, false, true);
        assertEquals("Hello World\n", builder.build());
    }

    @VisibleForTesting
    public static CharSequence rightTrim(CharSequence s) {
        StringBuilder2 sb = new StringBuilder2();
        for (int i = 0; i < s.length(); i++) {
            if (!s.substring(i).equals(s.substring(0, i))) {
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }

}