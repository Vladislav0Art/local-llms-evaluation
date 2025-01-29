package com.force.i18n.grammar.impl;

public class GeneratedTestPutToJsonFileWithNull {

    private TestHelper testHelper;

    @Before
    public void setUp() {
        testHelper = new TestHelper();
    }

    @Test
    public void testPutToJsonFileWithNull() throws Exception {
        // Create a sample JSON file with null value
        String json = "{\"test\": null}";

        // Put the JSON object into the file
        testHelper.putToJsonFile(json, "key", "value");

        // Get the result from the file
        Object data = testHelper.getFromJsonFile("key.json");

        // Print the results
        System.out.println(data);
    }

}