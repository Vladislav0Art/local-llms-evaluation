package org.jsoup.nodes;

public class GeneratedTestComment {

    @Test
    public void testComment() {
        // Arrange
        String comment = "This is a comment";

        // Act
        System.out.println(comment);

        // Assert
        assertEquals("This is a comment", comment);
    }

    public static class TestClass {
        private String value;

        public TestClass(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }

}