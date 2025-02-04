package org.jsoup.nodes;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;

import javax.annotation.Nullable;
import java.io.IOException;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedNewNodeWithInvalidData_ThrowsNullPointerException {

    @Test
    public void newNodeWithInvalidData_ThrowsNullPointerException() {
        assertThrows(NullPointerException.class, () -> new Comment(null));
    }

}