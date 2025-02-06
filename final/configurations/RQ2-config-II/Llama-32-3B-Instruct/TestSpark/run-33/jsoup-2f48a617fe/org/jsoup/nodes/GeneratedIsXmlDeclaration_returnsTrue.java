package org.jsoup.nodes;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;

import javax.annotation.Nullable;
import java.io.IOException;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

import static org.mockito.ArgumentMatchers.any;

public class GeneratedIsXmlDeclaration_returnsTrue {

    @Test
    public void isXmlDeclaration_returnsTrue() {
        Comment comment = new Comment("");
        assertTrue(comment.isXmlDeclaration());
    }

}