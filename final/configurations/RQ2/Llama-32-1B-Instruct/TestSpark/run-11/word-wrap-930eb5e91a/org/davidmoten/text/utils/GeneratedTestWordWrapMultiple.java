package org.davidmoten.text.utils;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Set;
import java.util.function.Function;

public class GeneratedTestWordWrapMultiple {

    @Test
    public void testWordWrapMultiple() throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader("Hello World\nThis is a test"));
        WordWrap.Builder builder = WordWrap.fromClasspath("resource", StandardCharsets.UTF_8);
        String result = builder.build();
        assertTrue(result.startsWith("H") && result.endsWith("llo"));
    }

    @VisibleForTesting
    public static CharSequence rightTrim(CharSequence s) {
        StringBuilder2 sb = new StringBuilder2();
        for (int i = 0; i < s.length(); i++) {
            if (!s.substring(i).equals(s.substring(0, i))) {
                sb.append(s.charAt(i));
            }
        }
        return sb.toString().trimEnd(); // Added trimEnd method
    }

}