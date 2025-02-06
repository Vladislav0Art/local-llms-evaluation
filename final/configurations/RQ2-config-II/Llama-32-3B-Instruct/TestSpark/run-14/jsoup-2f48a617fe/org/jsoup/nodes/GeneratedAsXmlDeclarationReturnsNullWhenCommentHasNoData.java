package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.util.HashMap;
import java.util.Map;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;

import javax.annotation.Nullable;
import java.io.IOException;

public class GeneratedAsXmlDeclarationReturnsNullWhenCommentHasNoData {

    @Test
    public void asXmlDeclarationReturnsNullWhenCommentHasNoData() {
        Comment comment = new Comment("");
        assertNull(comment.asXmlDeclaration());
    }

}