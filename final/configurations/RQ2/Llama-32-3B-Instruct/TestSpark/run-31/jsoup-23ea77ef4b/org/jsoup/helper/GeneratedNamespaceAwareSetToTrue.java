package org.jsoup.helper;

public class GeneratedNamespaceAwareSetToTrue {

    @Mock
    private DocumentBuilder documentBuilder;

    @Mock
    private DocumentFactory documentFactory;

    @Mock
    private Transformer transformer;

    public boolean namespaceAware() {
        return false;
    }

    public static void main(String[] args) {
    }

    @Test
    public void namespaceAwareSetToTrue() {
        boolean result = namespaceAware(true);
        org.junit.Assert.assertTrue(result);
    }

}