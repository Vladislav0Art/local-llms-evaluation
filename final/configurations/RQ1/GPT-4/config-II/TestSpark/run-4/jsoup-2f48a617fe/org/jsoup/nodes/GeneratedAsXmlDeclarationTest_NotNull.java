package org.jsoup.nodes;

import org.jsoup.nodes.*;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

public class GeneratedAsXmlDeclarationTest_NotNull {

    @Test
    public void asXmlDeclarationTest_NotNull() {
        Comment comment = new Comment("?xml version=\"1.0\" encoding=\"UTF-8\"?");
        assertNotNull(comment.asXmlDeclaration());
    }

}