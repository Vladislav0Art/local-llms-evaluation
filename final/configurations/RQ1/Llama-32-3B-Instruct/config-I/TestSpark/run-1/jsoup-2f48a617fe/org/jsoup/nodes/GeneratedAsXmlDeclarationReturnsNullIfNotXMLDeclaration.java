package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;
import javax.annotation.Nullable;

public class GeneratedAsXmlDeclarationReturnsNullIfNotXMLDeclaration {

    @Test
    public void asXmlDeclarationReturnsNullIfNotXMLDeclaration() {
        String data = "Some data";
        Comment comment = new Comment(data);
        assertNull(comment.asXmlDeclaration());
    }

}