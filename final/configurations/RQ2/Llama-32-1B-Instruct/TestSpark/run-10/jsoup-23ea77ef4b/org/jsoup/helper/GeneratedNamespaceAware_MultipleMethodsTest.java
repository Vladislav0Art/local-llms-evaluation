package org.jsoup.helper;

public class GeneratedNamespaceAware_MultipleMethodsTest {

    @Test
    public void namespaceAware_MultipleMethodsTest() throws Exception {
        // Given
        org.jsoup.nodes.Document doc = new Document();

        // When
        boolean result1 = W3CDom.namespaceAware();
        boolean result2 = W3CDom.namespaceAware(true);

        // Then
        Assert.assertTrue(result1);
        Assert.assertFalse(result2);
    }

}