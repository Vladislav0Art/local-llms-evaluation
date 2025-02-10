package org.davidmoten.text.utils;

public class GeneratedRightTrim_EmptyText_ReturnsEmptyCharSequence {

    @Test
    public void rightTrim_EmptyText_ReturnsEmptyCharSequence() {
        Preconditions.checkNotNull(WordWrap.rightTrim(""));
    }

}