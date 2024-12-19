package org.jsoup.parser;

import org.junit.jupiter.api.Test;

public class GeneratedTestGetRegisteredTags {

    private static final String TAG-emitter ="tag-emitter";

    @Test
    public void testGetRegisteredTags() {
        // Arrange
        Tag tag1 = new Tag("h1");
        TagEmitter emitter = new TagEmitter();
        emitter.register(tag1);

        Tag tag2 = new Tag("p");
        TagEmitter emitter2 = new TagEmitter();
        emitter2.register(tag2);

        // Act
        List<Tag> registeredTags = emitter.getRegisteredTags();

        // Assert
        assertEquals(2, registeredTags.size());
    }

}