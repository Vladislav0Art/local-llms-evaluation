package org.jsoup.nodes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedTestClone {

    @Test
    public void testClone() {
        MockComment mock = new MockComment();
        MockComment cloned = mock.clone();
        assertEquals(mock, cloned);
    }

}