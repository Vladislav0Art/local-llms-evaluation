package com.force.i18n.grammar.impl;

public class GeneratedGet {


    @Before
    public void setup() {
        mockMap = new HashMap<>();
        humanLanguage = new HumanLanguage();
        languageDictionary = new LanguageDictionary(humanLanguage);
        GrammaticalTermMapImpl testInstance = new GrammaticalTermMapImpl(mockMap, true);

        // Mock methods to be tested
        mockMap.put("testKey", testInstance.get("TestTerm"));
    }

    @Test
    public void get() {
        assertEquals(testInstance.get("testKey"), "TestTerm");
    }

}