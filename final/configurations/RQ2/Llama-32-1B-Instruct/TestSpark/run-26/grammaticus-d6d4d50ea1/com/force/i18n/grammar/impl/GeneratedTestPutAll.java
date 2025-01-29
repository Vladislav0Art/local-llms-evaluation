package com.force.i18n.grammar.impl;

public class GeneratedTestPutAll {

    private static MockRepository mockRepository;

    @Before
    public void setUp() {
        mockRepository = new MockRepository();
    }

    @Test
    public void testPutAll() {
        // Arrange
        Map<String, T> map = mockRepository.createMap();
        map.put("term1", mockRepository.createObject());
        map.put("term2", mockRepository.createObject());

        // Act
        GrammaticalTermMapImpl.class.getMethod("putAll").invoke(map);

        // Assert
        assertNotNull(GrammaticalTermMapImpl.class.getMethod("get", String.class).invoke(map, "term1"));
    }

}