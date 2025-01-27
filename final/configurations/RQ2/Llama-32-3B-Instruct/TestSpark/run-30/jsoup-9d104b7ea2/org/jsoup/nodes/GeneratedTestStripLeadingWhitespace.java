package org.jsoup.nodes;

public class GeneratedTestStripLeadingWhitespace {

    @Test
    public void testStripLeadingWhitespace() {
        String input = "Hello>   World";
        assertEquals("Hello>  World", StringUtil.stripLeadingWhitespace(input));
    }
}

public class GeneratedDocumentTest extends TestBase {
    @Override
    protected void beforeClass() throws Exception {
        super.beforeClass();
    }

    @Override
    protected void tearDownClass() throws Exception {
        super.tearDownClass();
    }

    public String test4() {
        Document document = new Document();
        return document.toString();
    }
}

public class StringUtilTest extends TestBase {
    private static final String input = "Hello>   World";

    @BeforeAll
    public void setUpStringUtilTest() {
        String trimmedInput = StringUtil.stripLeadingWhitespace(input);
        assertEquals("Hello>  World", trimmedInput);
    }

    @Override
    protected void beforeClass() throws Exception {
        super.beforeClass();
    }

    @Override
    protected void tearDownClass() throws Exception {
        super.tearDownClass();
    }

}