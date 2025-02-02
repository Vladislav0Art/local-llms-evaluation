package org.jsoup.nodes;

public class GeneratedTestValue {

    @Test
    public void testValue() throws IOException {
        // Arrange
        TestClass testObject = new TestClass("test value");

        // Act
        System.out.println(testObject.getValue());

        // Assert
        assertEquals("test value", testObject.getValue());
    }
}

}