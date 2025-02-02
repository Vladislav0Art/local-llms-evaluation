package org.jsoup.nodes;

public class GeneratedTestValueAsXmlDeclarationMixedData {

    @Test
    public void testValueAsXmlDeclarationMixedData() throws IOException {
        // Arrange
        TestClass testObject = new TestClass("test value");

        // Act
        System.out.println(testObject.getValue());

        // Assert
        assertEquals("test value", testObject.getValue());
    }
}

}