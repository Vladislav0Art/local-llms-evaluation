package com.force.i18n.grammar.impl;

public class GeneratedTestPutToJsonFile {

    private TestHelper testHelper;

    @Before
    public void setUp() {
        testHelper = new TestHelper();
    }

    @Test
    public void testPutToJsonFile() throws Exception {
        // Create a sample JSON file
        String json = "{\"test\": \"data\"}";

        // Put the JSON object into the file
        testHelper.putToJsonFile(json, "test2.json");

        // Get the result from the file
        Object data = testHelper.getFromJsonFile("test2.json");

        // Print the result
        System.out.println(data);
    }

}