package graphql.annotations.processor.retrievers.fieldBuilders;

public class GeneratedTest {

    @Test
    public void testBuildWithoutAnyDirectives() {
        DirectivesBuilder builder = new DirectivesBuilder(null, null);
        GraphQLDirective[] directives = builder.build();
        assertEquals(0, directives.length);
    }

    @Test
    public void testBuildWithSingleDirective() {
        AnnotatedElement annotation = new AnnotatedElement("GraphQLDirectives");
        ProcessingElementsContainer container = new ProcessingElementsContainer(new ArrayList<>());
        DirectivesBuilder builder = new DirectivesBuilder(annotation, container);
        GraphQLDirective[] directives = builder.build();
        assertEquals(1, directives.length);
    }

    @Test
    public void testBuildWithMultipleDirectives() {
        AnnotatedElement annotation = new AnnotatedElement("GraphQLDirectives");
        ProcessingElementsContainer container = new ProcessingElementsContainer(new ArrayList<>());
        DirectivesBuilder builder = new DirectivesBuilder(annotation, container);
        GraphQLDirective[] directives = builder.build();
        assertEquals(3, directives.length);
    }

    @Test
    public void testBuildWithMultipleDirectivesAndAnnotations() {
        AnnotatedElement annotation1 = new AnnotatedElement("GraphQLDirectives");
        ProcessingElementsContainer container1 = new ProcessingElementsContainer(new ArrayList<>());
        DirectivesBuilder builder1 = new DirectivesBuilder(annotation1, container1);
        GraphQLDirective[] directives1 = builder1.build();
        assertEquals(4, directives1.length);

        AnnotatedElement annotation2 = new AnnotatedElement("GraphQLAnnotation");
        ProcessingElementsContainer container2 = new ProcessingElementsContainer(new ArrayList<>());
        DirectivesBuilder builder2 = new DirectivesBuilder(annotation2, container2);
        GraphQLDirective[] directives2 = builder2.build();
        assertEquals(4, directives2.length);

        // Create a class with multiple annotations
        Class<?> clazz = new Class<>();
        Object obj = clazz.newInstance();

        // Check that the builder can handle all classes
        for (Method method : clazz.getDeclaredMethods()) {
            DirectivesBuilder builder = new DirectivesBuilder(method.getAnnotation(AnnotatedElement.class), null);
            GraphQLDirective[] directives = builder.build();
            assertEquals(4, directives.length);

            try {
                Annotation[] annotations = method.getAnnotation(AnnotatedElement.class).value().getAnnotations();
                for (Annotation annotation : annotations) {
                    DirectivesBuilder builder1 = new DirectivesBuilder(annotation, null);
                    GraphQLDirective[] directives1 = builder1.build();
                    assertEquals(4, directives1.length);
                }
            } catch (Exception e) {
                // Ignore
            }

            try {
                Annotation[] annotations = method.getAnnotation(AnnotatedElement.class).value().getAnnotationsArray();
                for (Annotation annotation : annotations) {
                    DirectivesBuilder builder2 = new DirectivesBuilder(annotation, null);
                    GraphQLDirective[] directives2 = builder2.build();
                    assertEquals(4, directives2.length);
                }
            } catch (Exception e) {
                // Ignore
            }

            try {
                Annotation[] annotations = method.getAnnotation(AnnotatedElement.class).value().getFields();
                for (Annotation annotation : annotations) {
                    DirectivesBuilder builder3 = new DirectivesBuilder(annotation, null);
                    GraphQLDirective[] directives3 = builder3.build();
                    assertEquals(4, directives3.length);
                }
            } catch (Exception e) {
                // Ignore
            }

            try {
                Annotation[] annotations = method.getAnnotation(AnnotatedElement.class).value().getFieldsArray();
                for (Annotation annotation : annotations) {
                    DirectivesBuilder builder3 = new DirectivesBuilder(annotation, null);
                    GraphQLDirective[] directives3 = builder3.build();
                    assertEquals(4, directives3.length);
                }
            } catch (Exception e) {
                // Ignore
            }

            try {
                Annotation[] annotations = method.getAnnotation(AnnotatedElement.class).value().getConstructors();
                for (Annotation annotation : annotations) {
                    DirectivesBuilder builder4 = new DirectivesBuilder(annotation, null);
                    GraphQLDirective[] directives4 = builder4.build();
                    assertEquals(4, directives4.length);
                }
            } catch (Exception e) {
                // Ignore
            }

            try {
                Annotation[] annotations = method.getAnnotation(AnnotatedElement.class).value().getMethods();
                for (Annotation annotation : annotations) {
                    DirectivesBuilder builder5 = new DirectivesBuilder(annotation, null);
                    GraphQLDirective[] directives5 = builder5.build();
                    assertEquals(4, directives5.length);
                }
            } catch (Exception e) {
                // Ignore
            }

            try {
                Annotation[] annotations = method.getAnnotation(AnnotatedElement.class).value().getFields();
                for (Annotation annotation : annotations) {
                    DirectivesBuilder builder6 = new DirectivesBuilder(annotation, null);
                    GraphQLDirective[] directives6 = builder6.build();
                    assertEquals(4, directives6.length);
                }
            } catch (Exception e) {
                // Ignore
            }

            try {
                Annotation[] annotations = method.getAnnotation(AnnotatedElement.class).value().getConstructors();
                for (Annotation annotation : annotations) {
                    DirectivesBuilder builder7 = new DirectivesBuilder(annotation, null);
                    GraphQLDirective[] directives7 = builder7.build();
                    assertEquals(4, directives7.length);
                }
            } catch (Exception e) {
                // Ignore
            }

            try {
                Annotation[] annotations = method.getAnnotation(AnnotatedElement.class).value().getMethods();
                for (Annotation annotation : annotations) {
                    DirectivesBuilder builder8 = new DirectivesBuilder(annotation, null);
                    GraphQLDirective[] directives8 = builder8.build();
                    assertEquals(4, directives8.length);
                }
            } catch (Exception e) {
                // Ignore
            }

            try {
                Annotation[] annotations = method.getAnnotation(AnnotatedElement.class).value().getFieldsArray();
                for (Annotation annotation : annotations) {
                    DirectivesBuilder builder9 = new DirectivesBuilder(annotation, null);
                    GraphQLDirective[] directives9 = builder9.build();
                    assertEquals(4, directives9.length);
                }
            } catch (Exception e) {
                // Ignore
            }

            try {
                Annotation[] annotations = method.getAnnotation(AnnotatedElement.class).value().getConstructorsArray();
                for (Annotation annotation : annotations) {
                    DirectivesBuilder builder10 = new DirectivesBuilder(annotation, null);
                    GraphQLDirective[] directives10 = builder10.build();
                    assertEquals(4, directives10.length);
                }
            } catch (Exception e) {
                // Ignore
            }

            try {
                Annotation[] annotations = method.getAnnotation(AnnotatedElement.class).value().getMethodsArray();
                for (Annotation annotation : annotations) {
                    DirectivesBuilder builder11 = new DirectivesBuilder(annotation, null);
                    GraphQLDirective[] directives11 = builder11.build();
                    assertEquals(4, directives11.length);
                }
            } catch (Exception e) {
                // Ignore
            }

        }
    }

}