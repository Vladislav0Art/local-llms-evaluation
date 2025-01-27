package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;

import org.jsoup.parser.ParseSettings;

import javax.annotation.Nullable;
import java.util.Arrays;

public class GeneratedIsXmlDeclarationComment_ReturnsFalse {

    @Test
    public void isXmlDeclarationComment_ReturnsFalse() {
        Comment comment = new Comment("data");
        assertFalse(comment.isXmlDeclaration());
    }

}