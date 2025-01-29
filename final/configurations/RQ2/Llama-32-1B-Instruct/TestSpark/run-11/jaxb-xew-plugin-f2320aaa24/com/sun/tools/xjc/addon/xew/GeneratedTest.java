package com.sun.tools.xjc.addon.xew;

public class GeneratedTest {

    private JClassClassContainer container = new JClassClassContainer();

    @Test
    public void testAddAnnotation() {
        // Given
        Element element = new Element();
        addAnnotation(element);

        // When
        container.addClass(element);

        // Then
        getAnnotation(element).addAnnotation();
    }

    @Test
    public void testCopyAnnotationMemberValue() {
        // Given
        Element element = new Element();

        // When
        copyAnnotationMemberValue(element);

        // Then
        assertEquals("value", getAnnotation(element).getValue());
    }

    @Test
    public void testCopyFields() {
        // Given
        Element element = new Element();
        addField(element, "field");

        // When
        copyFields(element);

        // Then
        setPrivateField(element, "field");
    }

    @Test
    public void testGenerableToString() {
        // Given
        Element element = new Element();

        // When
        String result = generableToString(element);

        // Then
        assertEquals("value", result);
    }

    @Test
    public void testGetAnnotationMemberValue() {
        // Given
        Element element = new Element();
        addAnnotation(element, "annotation");

        // When
        getAnnotationMemberValue(element, "attribute");

        // Then
        assertNotNull(getAnnotation(element).getAttribute());
    }

    @Test
    public void testGetPrivateField() {
        // Given
        Element element = new Element();

        // When
        getPrivateField(element, "field");

        // Then
        assertNotNull(getPrivateField(element, "field"));
    }

    @Test
    public void testGetXsdDeclaration() {
        // Given
        Element element = new Element();
        addXsdDeclaration(element);

        // When
        String result = getXsdDeclaration(element);

        // Then
        assertEquals("value", result);
    }

    @Test
    public void testHasPropertyNameCustomization() {
        // Given
        Element element = new Element();

        // When
        hasPropertyNameCustomization(element);

        // Then
        assertTrue(getPropertyInfo(element, "attribute").hasCustomization());
    }

    @Test
    public void testHiddenClass() {
        // Given
        JAnnotatable annotatable = new JAnnotatable(container);

        // When
        ObjectUtils.asObject(annotatable);

        // Then
        assertNotEquals("value", annotatable.toString().split("\\r?\\n")[0]);
    }

    @Test
    public void testIsListedAsParametrisation() {
        // Given
        Element element = new Element();
        addAnnotation(element, "annotation");

        // When
        isListedAsParametrisation(element);

        // Then
        assertTrue(getPropertyInfo(element, "attribute").isListedAsParametrization());
    }

    @Test
    public void testIsXsdDeclaration() {
        // Given
        Element element = new Element();
        addXsdDeclaration(element);

        // When
        isXsdDeclaration(element);

        // Then
        assertTrue(getPropertyInfo(element, "attribute").isXsdDeclaration());
    }

    @Test
    public void testIsValidName() {
        // Given
        Element element = new Element();

        // When
        isValidName(element);

        // Then
        assertFalse(getPropertyInfo(element, "attribute").isValidName());
    }

    @Test
    public void testIsXsdDeclarationWithNamespace() {
        // Given
        Element element = new Element();
        addXsdDeclaration(element);
        QName qname = new QName("http://example.com", "ns");

        // When
        isXsdDeclarationWithNamespace(element, qname);

        // Then
        assertTrue(getPropertyInfo(element, "attribute").isXsdDeclarationWithNamespace(qname));
    }

    @Test
    public void testIsXsdDeclarationWithoutNamespace() {
        // Given
        Element element = new Element();
        addXsdDeclaration(element);

        // When
        isXsdDeclarationWithoutNamespace(element);

        // Then
        assertFalse(getPropertyInfo(element, "attribute").isXsdDeclarationWithoutNamespace());
    }

    @Test
    public void testSetPrivateField() {
        // Given
        JClassClassContainer container = new JClassClassContainer();
        Element element = new Element();

        // When
        setPrivateField(container, element);

        // Then
        assertTrue(getPropertyInfo(element, "attribute").getPrivate());
    }

    @Test
    public void testSetXsdDeclaration() {
        // Given
        Element element = new Element();
        addXsdDeclaration(element);

        // When
        setXsdDeclaration(element);

        // Then
        assertEquals("value", getPropertyInfo(element, "attribute").getXsdDeclaration());
    }

}