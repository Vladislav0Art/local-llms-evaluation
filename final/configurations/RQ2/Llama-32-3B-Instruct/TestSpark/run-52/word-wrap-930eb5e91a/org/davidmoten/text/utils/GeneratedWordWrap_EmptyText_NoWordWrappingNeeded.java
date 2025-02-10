package org.davidmoten.text.utils;

public class GeneratedWordWrap_EmptyText_NoWordWrappingNeeded {

    @Test
    public void wordWrap_EmptyText_NoWordWrappingNeeded() throws IOException {
        Preconditions.checkNotNull(WordWrap.wordWrap(new ArrayList<>(), new StringBuilder(), "\n", 10L,
                s -> 0L, new HashSet<>(), false, false));
    }

}