package org.jsoup.nodes;

public class GeneratedTestCreateFromEncodedInvalidMethod {

    @Override
    public void setUp() throws Exception {
        super.setUp();
    }

    @Test
    public void testCreateFromEncodedInvalidMethod() {
        // Test the createFromEncoded invalid method
        Object obj = new Object();
        String encodedObj = EncodeUtil.encode(obj);
        try {
            DecodeUtil.decode(encodedObj);
            fail("Expected exception not thrown");
        } catch (Exception e) {
            assertEquals("Invalid encoded string", e.getMessage());
        }
    }
}

public class Test {

    public static void main(String[] args) {
        junit.textui.TestRunner.run(OuterHtmlTailTest.class.getName());
    }

}