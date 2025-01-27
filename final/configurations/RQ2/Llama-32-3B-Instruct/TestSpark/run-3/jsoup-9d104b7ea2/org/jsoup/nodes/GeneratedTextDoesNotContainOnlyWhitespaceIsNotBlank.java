package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

import org.jsoup.helper.Validate;

import static org.mockito.Mockito.*;

public class GeneratedTextDoesNotContainOnlyWhitespaceIsNotBlank {

    @Test
    public void textDoesNotContainOnlyWhitespaceIsNotBlank() {
        assertEquals(false, new TextNode("Hello").isBlank());
    }
}

}