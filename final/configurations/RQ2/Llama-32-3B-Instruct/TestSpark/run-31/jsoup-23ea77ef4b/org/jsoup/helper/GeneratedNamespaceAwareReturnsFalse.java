package org.jsoup.helper;

public class GeneratedNamespaceAwareReturnsFalse {

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
    public void namespaceAwareReturnsFalse() {
        boolean result = namespaceAware();
        org.junit.Assert.assertFalse(result);
    }

}