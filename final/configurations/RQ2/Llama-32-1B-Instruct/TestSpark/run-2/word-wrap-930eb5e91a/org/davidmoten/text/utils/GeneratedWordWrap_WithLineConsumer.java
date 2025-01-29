package org.davidmoten.text.utils;

import org.davidmoten.text.utils.Builder;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedWordWrap_WithLineConsumer {

    @Test
    public void wordWrap_WithLineConsumer() throws IOException {
        StringBuilder out = new StringBuilder();
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out, StandardCharsets.UTF_8));
        wordWrap(builder, out, 100,
                Function.identity(), null, false, true);
        assertEquals(text, String.join("\n", Arrays.asList(out.toString(), "\n")));
    }

}