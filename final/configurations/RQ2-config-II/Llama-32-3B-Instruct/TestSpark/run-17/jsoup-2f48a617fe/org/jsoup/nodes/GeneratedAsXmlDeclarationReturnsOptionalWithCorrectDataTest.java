package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Optional;

public class GeneratedAsXmlDeclarationReturnsOptionalWithCorrectDataTest {

    @Test
    public void asXmlDeclarationReturnsOptionalWithCorrectDataTest() {
        Comment comment = new Comment("data");
        Optional<XmlDeclaration> result = comment.asXmlDeclaration();
        assertEquals(Optional.of(comment.asXmlDeclaration()), result);
    }

}