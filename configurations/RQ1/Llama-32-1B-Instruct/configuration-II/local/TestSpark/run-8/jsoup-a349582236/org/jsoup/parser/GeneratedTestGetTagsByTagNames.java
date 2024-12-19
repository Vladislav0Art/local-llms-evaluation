package org.jsoup.parser;

import org.junit.jupiter.api.Test;

public class GeneratedTestGetTagsByTagNames {

    private static final String TAG-emitter ="tag-emitter";

    @Test
    public void testGetTagsByTagNames() {
        // Arrange
        Tag tag1 = new Tag("h1");
        TagEmitter emitter = new TagEmitter();
        emitter.register(tag1);

        Tag tag2 = new Tag("p");
        TagEmitter emitter2 = new TagEmitter();
        emitter2.register(tag2);

        Tag tag3 = new Tag("ul");
        TagEmitter emitter3 = new TagEmitter();
        emitter3.register(tag3);

        // Act
        List<Tag> tags = emitter.getTagsByTagNames(new String[]{"h1", "p", "ul"});

        // Assert
        assertEquals(3, tags.size());
    }

}