package org.jsoup.nodes;

public class GeneratedTestExpectFormReturnsNullDocumentNoForm {

    @Test
    public void testExpectFormReturnsNullDocumentNoForm() {
        Document document = new Document();
        String cssQuery = "div";
        FormElement form = null;
        assertEquals(form, document.expectForm(cssQuery));
    }
}

public class MockedMethods {

    @Mock
    public static Method createShell(String baseUri) {
        return mock(Method.class);
    }

    @Mock
    public static Method title() {
        return mock(Method.class);
    }

    @Mock
    public static String getTitle() {
        return "";
    }

}