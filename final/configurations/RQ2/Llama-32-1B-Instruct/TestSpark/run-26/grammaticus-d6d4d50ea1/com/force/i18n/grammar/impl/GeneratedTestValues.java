package com.force.i18n.grammar.impl;

public class GeneratedTestValues {

    private static MockRepository mockRepository;

    @Before
    public void setUp() {
        mockRepository = new MockRepository();
    }

    @Test
    public void testValues() {
        // Arrange
        Map<String, T> map = mockRepository.createMap();
        map.put("term1", mockRepository.createObject());

        // Act
        Collection<T> result = GrammaticalTermMapImpl.class.getMethod("values").invoke(map);

        // Assert
        assertNotNull(result);
    }

}