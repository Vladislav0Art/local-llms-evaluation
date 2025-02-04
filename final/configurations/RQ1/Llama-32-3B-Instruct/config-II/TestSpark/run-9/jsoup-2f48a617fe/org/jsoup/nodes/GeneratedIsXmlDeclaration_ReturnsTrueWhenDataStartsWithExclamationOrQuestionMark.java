package org.jsoup.nodes;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;

import javax.annotation.Nullable;
import java.io.IOException;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedIsXmlDeclaration_ReturnsTrueWhenDataStartsWithExclamationOrQuestionMark {

    @Test
    public void IsXmlDeclaration_ReturnsTrueWhenDataStartsWithExclamationOrQuestionMark() {
        Comment comment = new Comment("!Hello, World!");
        assertTrue(comment.isXmlDeclaration());
        assertTrue(comment.isXmlDeclaration());
    }

}