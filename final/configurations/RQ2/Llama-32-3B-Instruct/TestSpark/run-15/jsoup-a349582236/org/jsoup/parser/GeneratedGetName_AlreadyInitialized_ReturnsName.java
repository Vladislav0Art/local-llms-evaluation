package org.jsoup.parser;

public class GeneratedGetName_AlreadyInitialized_ReturnsName {

    @Test
    public void getName_AlreadyInitialized_ReturnsName() {
        String name = "div";
        Tag tag = new Tag(name);
        Mockito.when(Tag.valueOf(name)).thenReturn(tag);
        assertEquals(name, tag.getName());
    }

    public static class Tag {
        private final String name;

        public Tag(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }
}

}