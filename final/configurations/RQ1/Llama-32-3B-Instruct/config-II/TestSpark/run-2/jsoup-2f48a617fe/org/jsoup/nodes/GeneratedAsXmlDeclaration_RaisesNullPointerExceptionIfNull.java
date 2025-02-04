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

public class GeneratedAsXmlDeclaration_RaisesNullPointerExceptionIfNull {

    @Test
    public void asXmlDeclaration_RaisesNullPointerExceptionIfNull() {
        Comment comment = new Comment("");
        NullPointerException expected = null;
        assertThrows(expected, () -> comment.asXmlDeclaration());
    }

}