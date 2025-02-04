package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;

import javax.annotation.Nullable;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

import org.mockito.Mockito;

public class GeneratedIsXmlDeclaration_ReturnsFalseForSimpleString {

    @Test
    public void isXmlDeclaration_ReturnsFalseForSimpleString() {
        Comment comment = new Comment("Hello World!");
        assertFalse(comment.isXmlDeclaration());
    }

}