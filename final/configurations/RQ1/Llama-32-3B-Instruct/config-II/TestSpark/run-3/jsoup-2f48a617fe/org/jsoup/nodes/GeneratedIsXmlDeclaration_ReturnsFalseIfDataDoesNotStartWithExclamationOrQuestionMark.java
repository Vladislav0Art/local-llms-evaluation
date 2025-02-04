package org.jsoup.nodes;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;

import javax.annotation.Nullable;
import java.io.IOException;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedIsXmlDeclaration_ReturnsFalseIfDataDoesNotStartWithExclamationOrQuestionMark {

    @Test
    public void isXmlDeclaration_ReturnsFalseIfDataDoesNotStartWithExclamationOrQuestionMark() {
        Comment comment = new Comment("data");
        assertFalse(comment.isXmlDeclaration());
    }

}