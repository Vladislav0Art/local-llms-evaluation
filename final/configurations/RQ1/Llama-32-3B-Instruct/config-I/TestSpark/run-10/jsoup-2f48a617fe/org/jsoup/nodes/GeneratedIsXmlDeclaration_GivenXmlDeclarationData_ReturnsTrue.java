package org.jsoup.nodes;

import org.jsoup.parser.ParseSettings;

import javax.annotation.Nullable;
import java.io.IOException;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedIsXmlDeclaration_GivenXmlDeclarationData_ReturnsTrue {

    public static interface Appendable extends StringBuilder {
        void append(String data);
    }

    @Test
    public void isXmlDeclaration_GivenXmlDeclarationData_ReturnsTrue() {
        String data = "!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\"";
        Comment comment = new Comment(data);
        assertTrue(comment.isXmlDeclaration());
    }

}