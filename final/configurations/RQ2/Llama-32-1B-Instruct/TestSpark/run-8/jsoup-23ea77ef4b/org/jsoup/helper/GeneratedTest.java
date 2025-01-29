package org.jsoup.helper;

public class GeneratedTest {

    @Test
    public void testNamespaceAware() {
        W3CElementHelper element = new W3CElementHelper(new org.jsoup.nodes.Document());
        assertTrue(element.getName().equals("namespaceAware"));
    }

    @Test
    public void testNamespaceAwareConstructor() {
        W3CDom dom = new org.jsoup.nodes.Document();
        W3CElementHelper element = new W3CElementHelper(dom);
        assertTrue(element.getName().equals("namespaceAware"));
    }

    @Test
    public void testConvert() throws Exception {
        String doc = "<doc><body>Hello World!</body></doc>";
        Document convertedDoc = W3CDomHelper.convert(new org.jsoup.nodes.Document(doc));
        assertEquals("<doc><body>Hello World!</body></doc>", convertedDoc.toString());
    }

    @Test
    public void testGetTagNames() {
        String doc = "<html><head><title>Home Page</title></head><body>Hello World!</body></html>";
        org.jsoup.nodes.Document docObj = new org.jsoup.nodes.Document(doc);
        Map<String, String> tagNames = W3CElementHelper.getTagsMap();
        assertEquals(docObj.select("body").size() + 1, tagNames.size());
    }

    @Test
    public void testGetTagValues() {
        String doc = "<html><head><title>Home Page</title></head><body>Hello World!</body></html>";
        org.jsoup.nodes.Document docObj = new org.jsoup.nodes.Document(doc);
        Map<String, String> tagValues = W3CElementHelper.getTagsMap();
        assertEquals(docObj.select("title").first().text(), tagValues.get("title"));
    }

    @Test
    public void testGetTagText() {
        String doc = "<html><head><title>Home Page</title></head><body>Hello World!</body></html>";
        org.jsoup.nodes.Document docObj = new org.jsoup.nodes.Document(doc);
        assertEquals("Hello World!", W3CElementHelper.getTagsMap().get("text"));
    }

    @Test
    public void testGetTagAttributes() {
        String doc = "<html><head><title>Home Page</title></head><body>Hello World!</body></html>";
        org.jsoup.nodes.Document docObj = new org.jsoup.nodes.Document(doc);
        Map<String, Object> tagAttributes = W3CElementHelper.getTagsMap();
        assertEquals("title", tagAttributes.get("title"));
    }

    @Test
    public void testGetTagId() {
        String doc = "<html><head><title>Home Page</title></head><body>Hello World!</body></html>";
        org.jsoup.nodes.Document docObj = new org.jsoup.nodes.Document(doc);
        assertEquals(null, W3CElementHelper.getTagsMap().get("id"));
    }

    @Test
    public void testGetTagClass() {
        String doc = "<html><head><title>Home Page</title></head><body>Hello World!</body></html>";
        org.jsoup.nodes.Document docObj = new org.jsoup.nodes.Document(doc);
        assertEquals(null, W3CElementHelper.getTagsMap().get("class"));
    }

    @Test
    public void testGetTagStyle() {
        String doc = "<html><head><title>Home Page</title></head><body>Hello World!</body></html>";
        org.jsoup.nodes.Document docObj = new org.jsoup.nodes.Document(doc);
        assertEquals(null, W3CElementHelper.getTagsMap().get("style"));
    }

    @Test
    public void testGetTagIdValue() {
        String doc = "<html><head><title>Home Page</title></head><body>Hello World!</body></html>";
        org.jsoup.nodes.Document docObj = new org.jsoup.nodes.Document(doc);
        assertEquals(null, W3CElementHelper.getTagsMap().get("id").toString());
    }

    @Test
    public void testGetTagClassValue() {
        String doc = "<html><head><title>Home Page</title></head><body>Hello World!</body></html>";
        org.jsoup.nodes.Document docObj = new org.jsoup.nodes.Document(doc);
        assertEquals(null, W3CElementHelper.getTagsMap().get("class").toString());
    }

    @Test
    public void testGetTagStyleValue() {
        String doc = "<html><head><title>Home Page</title></head><body>Hello World!</body></html>";
        org.jsoup.nodes.Document docObj = new org.jsoup.nodes.Document(doc);
        assertEquals(null, W3CElementHelper.getTagsMap().get("style").toString());
    }

    @Test
    public void testGetTagValues() {
        String doc = "<html><head><title>Home Page</title></head><body>Hello World!</body></html>";
        org.jsoup.nodes.Document docObj = new org.jsoup.nodes.Document(doc);
        Map<String, Object> tagValues = W3CElementHelper.getTagsMap();
        assertEquals("Hello World!", tagValues.get("text"));
    }

}