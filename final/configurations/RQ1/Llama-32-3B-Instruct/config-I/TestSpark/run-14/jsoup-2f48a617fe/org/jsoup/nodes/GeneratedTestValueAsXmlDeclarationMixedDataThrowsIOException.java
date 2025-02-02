package org.jsoup.nodes;

public class GeneratedTestValueAsXmlDeclarationMixedDataThrowsIOException {

    @Test
    public void testValueAsXmlDeclarationMixedDataThrowsIOException() throws IOException {
        // Arrange
        TestClass testObject = new TestClass("test value");

        // Act
        try {
            System.out.println(testObject.getValue());
            fail();
        } catch (IOException e) {
        }

        // Assert
        assertTrue(true);
    }

}