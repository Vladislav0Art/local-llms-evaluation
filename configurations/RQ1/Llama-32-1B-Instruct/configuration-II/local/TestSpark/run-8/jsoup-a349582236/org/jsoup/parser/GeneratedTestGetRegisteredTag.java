package org.jsoup.parser;

import org.junit.jupiter.api.Test;

public class GeneratedTestGetRegisteredTag {

    private static final String TAG-emitter ="tag-emitter";

    @Test
    public void testGetRegisteredTag() {
        // Arrange
        Tag tag = new Tag("h1");
        TagEmitter emitter = new TagEmitter();
        emitter.register(tag);

        // Act
        Tag registeredTag = emitter.getRegisteredTag();

        // Assert
        assertEquals(tag, registeredTag);
    }

}