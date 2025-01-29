package com.sun.tools.xjc.addon.xew;

public class GeneratedTest {

    @Test
    public void testGetAnnotation() {
        JAnnotatable annot = getAnnotation(XSComponent.class);
        assertNotNull(annot);
    }

    @Test
    public void testCopyFields() {
        JClass container = new JClassContainer();
        JFieldVar fieldVar = container.createField("x", new JFieldVar() {
            public String toString() {
                return "x";
            }
        });
        addAnnotation(fieldVar, "xsd:complexType");
        copyFields(container, fieldVar);
    }

    @Test
    public void testCopyFieldsWithClassContainer() {
        JAnnotatable annot = getAnnotation(XSComponent.class);
        assertNotNull(annot);

        JClass container = new JClassContainer();
        container.addAnnotatable(getAnnotation(XSComponent.class), annot);
        addAnnotation(container, "xsd:complexType");

        JFieldVar fieldVar = container.createField("x", new JFieldVar() {
            public String toString() {
                return "x";
            }
        });
        copyFields(container, fieldVar);
    }

    @Test
    public void testGetPrivateField() {
        JClass classContainer = getClass();
        privateField(classContainer, "x", "y");
        getPrivateField(classContainer, "x");

        ObjectUtils.assertNotNull(getPrivateField(classContainer, "x"));
    }

    @Test
    public void testCopyAnnotationMemberValue() {
        JAnnotatable annot = getAnnotation(XSComponent.class);
        assertNotNull(annot);

        annotate(annot, "xsd:complexType", "x");
        copyAnnotationMemberValue(annot, "xsd:complexType");

        addAnnotation(getAnnotation(XSComponent.class), "xsd:complexType");

        JAnnotatable container = new JClassContainer();
        container.addAnnotatable(getAnnotation(XSComponent.class), annot);
        addAnnotation(container, "xsd:complexType");
    }

    @Test
    public void testCopyFieldsWithFieldVar() {
        JAnnotatable annot = getAnnotation(XSComponent.class);
        assertNotNull(annot);

        JClass classContainer = new JClassContainer();
        FieldVar fieldVar = classContainer.createField("x", new JFieldVar() {
            public String toString() {
                return "x";
            }
        });
        addAnnotation(fieldVar, "xsd:complexType");

        copyFields(classContainer, fieldVar);
    }

    @Test
    public void testGetAnnotationMemberValue() {
        JAnnotatable annot = getAnnotation(XSComponent.class);
        assertNotNull(annot);

        annotate(annot, "xsd:complexType", "x");
        copyAnnotationMemberValue(annot, "xsd:complexType");

        addAnnotation(getAnnotation(XSComponent.class), "xsd:complexType");

        JClass classContainer = new JClassContainer();
        classContainer.addAnnotatable(getAnnotation(XSComponent.class), annot);
        addAnnotation(classContainer, "xsd:complexType");
    }

    @Test
    public void testGetAnnotationMember() {
        JAnnotatable annot = getAnnotation(XSComponent.class);
        assertNotNull(annot);

        annotate(annot, "xsd:complexType", "x");
        copyAnnotationMember(getAnnotation(XSComponent.class), "xsd:complexType");

        addAnnotation(getAnnotation(XSComponent.class), "xsd:complexType");

        JClass classContainer = new JClassContainer();
        classContainer.addAnnotatable(getAnnotation(XSComponent.class), annot);
        addAnnotation(classContainer, "xsd:complexType");
    }

    @Test
    public void testGetAnnotationMemberRef() {
        JAnnotatable annot = getAnnotation(XSComponent.class);
        assertNotNull(annot);

        annotate(annot, "xsd:complexType", "x");
        copyAnnotationMember(getAnnotation(XSComponent.class), "xsd:complexType");

        addAnnotation(getAnnotation(XSComponent.class), "xsd:complexType");

        JClass classContainer = new JClassContainer();
        classContainer.addAnnotatable(getAnnotation(XSComponent.class), annot);
        addAnnotation(classContainer, "xsd:complexType");
    }

    @Test
    public void testGetFieldVar() {
        JAnnotatable annot = getAnnotation(XSComponent.class);
        assertNotNull(annot);

        annotate(annot, "xsd:complexType", "x");
        copyFields(getAnnotation(XSComponent.class), new FieldVar("x"));

        addAnnotation(getAnnotation(XSComponent.class), "xsd:complexType");

        JClass classContainer = new JClassContainer();
        classContainer.addAnnotatable(getAnnotation(XSComponent.class), annot);
        addAnnotation(classContainer, "xsd:complexType");
    }

    @Test
    public void testGetJavaName() {
        JAnnotatable annot = getAnnotation(XSComponent.class);
        assertNotNull(annot);

        annotate(annot, "xsd:complexType", "x");
        copyFields(getAnnotation(XSComponent.class), new JavaName("x"));

        addAnnotation(getAnnotation(XSComponent.class), "xsd:complexType");

        JClass classContainer = new JClassContainer();
        classContainer.addAnnotatable(getAnnotation(XSComponent.class), annot);
        addAnnotation(classContainer, "xsd:complexType");
    }

    @Test
    public void testGetMethodDeclaration() {
        JAnnotatable annot = getAnnotation(XSComponent.class);
        assertNotNull(annot);

        annotate(annot, "xsd:complexType", "x");
        copyFields(getAnnotation(XSComponent.class), new MethodDecl("x"));

        addAnnotation(getAnnotation(XSComponent.class), "xsd:complexType");

        JClass classContainer = new JClassContainer();
        classContainer.addAnnotatable(getAnnotation(XSComponent.class), annot);
        addAnnotation(classContainer, "xsd:complexType");
    }

    @Test
    public void testGetFieldVarMethodDeclaration() {
        JAnnotatable annot = getAnnotation(XSComponent.class);
        assertNotNull(annot);

        annotate(annot, "xsd:complexType", "x");
        copyFields(getAnnotation(XSComponent.class), new FieldVar("x"));

        addAnnotation(getAnnotation(XSComponent.class), "xsd:complexType");

        JClass classContainer = new JClassContainer();
        classContainer.addAnnotatable(getAnnotation(XSComponent.class), annot);
        addAnnotation(classContainer, "xsd:complexType");
    }

    @Test
    public void testGetMethodDeclarationWithFieldVar() {
        JAnnotatable annot = getAnnotation(XSComponent.class);
        assertNotNull(annot);

        annotate(annot, "xsd:complexType", "x");
        copyFields(getAnnotation(XSComponent.class), new MethodDecl("x"));

        addAnnotation(getAnnotation(XSComponent.class), "xsd:complexType");

        JClass classContainer = new JClassContainer();
        classContainer.addAnnotatable(getAnnotation(XSComponent.class), annot);
        addAnnotation(classContainer, "xsd:complexType");
    }

    @Test
    public void testGetMethodDeclarationWithFieldVarAndJavaName() {
        JAnnotatable annot = getAnnotation(XSComponent.class);
        assertNotNull(annot);

        annotate(annot, "xsd:complexType", "x");
        copyFields(getAnnotation(XSComponent.class), new MethodDecl("x"));
        setJavaName(getAnnotation(XSComponent.class), "xsd:complexType");

        addAnnotation(getAnnotation(XSComponent.class), "xsd:complexType");

        JClass classContainer = new JClassContainer();
        classContainer.addAnnotatable(getAnnotation(XSComponent.class), annot);
        addAnnotation(classContainer, "xsd:complexType");
    }

    @Test
    public void testGetFieldVarMethodDeclarationWithJavaName() {
        JAnnotatable annot = getAnnotation(XSComponent.class);
        assertNotNull(annot);

        annotate(annot, "xsd:complexType", "x");
        copyFields(getAnnotation(XSComponent.class), new FieldVar("x"));

        addAnnotation(getAnnotation(XSComponent.class), "xsd:complexType");

        JClass classContainer = new JClassContainer();
        classContainer.addAnnotatable(getAnnotation(XSComponent.class), annot);
        addAnnotation(classContainer, "xsd:complexType");
    }

    private void annotate(JAnnotatable annot, String name, Object value) {
        getAnnotation(annot).setAnnotationValue(name, value);
    }

    @SuppressWarnings("unchecked")
    private void setJavaName(JClass classContainer, String name) {
        for (JClass clazz : classContainer.getClasses()) {
            if (clazz.getName().equals(name)) {
                clazz.setAnnotatable(getAnnotation(XSComponent.class), "xsd:complexType");
                return;
            }
        }
    }

    private void copyFields(JAnnotatable annot, FieldVar fieldVar) {
        getAnnotation(annot).copyFieldTo(fieldVar);
    }

    private static JClass getClass() {
        // implementation to retrieve the class
    }

}