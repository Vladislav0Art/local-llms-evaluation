package com.force.i18n.grammar.impl;

public class GeneratedTestEquals {

    private static MockRepository mockRepository;

    @Before
    public void setUp() {
        mockRepository = new MockRepository();
    }

    @Test
    public void testEquals() {
        // Arrange
        Object obj1 = mockRepository.createObject();
        Object obj2 = mockRepository.createObject();

        // Act
        boolean result = GrammaticalTermMapImpl.class.getMethod("equals", Object.class).invoke(obj1, obj2);

        // Assert
        assertTrue(result);
    }

}