package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedConstructor_WithNullInput_SetsDataToNull {

    @Test
    public void constructor_WithNullInput_SetsDataToNull() {
        Comment comment = new Comment(null);
        assertNull(comment.getData());
    }

}