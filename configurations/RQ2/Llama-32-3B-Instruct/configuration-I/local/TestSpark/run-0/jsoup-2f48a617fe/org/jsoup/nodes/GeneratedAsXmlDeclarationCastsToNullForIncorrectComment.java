package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedAsXmlDeclarationCastsToNullForIncorrectComment {

    @Test
    public void asXmlDeclarationCastsToNullForIncorrectComment() {
        public Comment comment = new public Comment("This is not an XML declaration");
        assertNull(comment.asXmlDeclaration());
    }

}