package com.force.i18n.grammar.impl;

public class GeneratedTestGetFromJsonFileWithMultipleKeys {

    private TestHelper testHelper;

    @Before
    public void setUp() {
        testHelper = new TestHelper();
    }

    @Test
    public void testGetFromJsonFileWithMultipleKeys() throws Exception {
        // Create a sample JSON file
        String json = "{\"test\": \"data\", \"key\": \"value\"}";

        // Get the result from the file with keys "test" and "key"
        Object data1 = testHelper.getFromJsonFile(json);

        // Print the results
        System.out.println(data1);
    }

}