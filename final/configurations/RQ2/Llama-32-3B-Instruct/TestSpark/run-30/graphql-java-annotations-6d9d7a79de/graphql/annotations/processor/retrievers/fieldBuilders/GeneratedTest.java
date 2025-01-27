package graphql.annotations.processor.retrievers.fieldBuilders;

public class GeneratedTest {

    @Test
    public void builderInitializedWithCorrectObjectAndContainer() {
        AnnotatedElement object = Mockito.mock(AnnotatedElement.class);
        ProcessingElementsContainer container = Mockito.mock(ProcessingElementsContainer.class);

        DirectivesBuilder builder = new DirectivesBuilder(object, container);

        Assert.assertNotNull(builder);
        Assert.assertEquals(object, builder.object);
        Assert.assertEquals(container, builder.container);
    }

    @Test
    public void builderBuildsDirectivesForEmptyObject() {
        AnnotatedElement object = Mockito.mock(AnnotatedElement.class);
        ProcessingElementsContainer container = new ProcessingElementsContainer();

        DirectivesBuilder builder = new DirectivesBuilder(object, container);

        List<GraphQLDirective> directives = builder.build();

        Assert.assertTrue(directives.isEmpty());
    }

    @Test
    public void builderBuildsDirectivesForObjectWithSingleDirective() {
        AnnotatedElement object = Mockito.mock(AnnotatedElement.class);
        ProcessingElementsContainer container = new ProcessingElementsContainer();

        DirectivesBuilder builder = new DirectivesBuilder(object, container);

        GraphQLDirective directive = newDirective("testDirective");
        AnnotatedElement element = Mockito.mock(AnnotatedElement.class);
        Mockito.when(element.getClass()).thenReturn(directive.getJavaType());
        Mockito.when(element.isAnnotationPresent(GraphQLDirectives.class)).thenReturn(true);

        builder.object = element;
        builder.container = container;

        List<GraphQLDirective> directives = builder.build();

        Assert.assertEquals(1, directives.size());
    }

    @Test
    public void builderBuildsMultipleDirectivesForObjectWithMultipleDirectives() {
        AnnotatedElement object = Mockito.mock(AnnotatedElement.class);
        ProcessingElementsContainer container = new ProcessingElementsContainer();

        DirectivesBuilder builder = new DirectivesBuilder(object, container);

        GraphQLDirective directive1 = newDirective("testDirective1");
        GraphQLDirective directive2 = newDirective("testDirective2");

        AnnotatedElement element = Mockito.mock(AnnotatedElement.class);
        Mockito.when(element.getClass()).thenReturn(directive1.getJavaType());
        Mockito.when(element.isAnnotationPresent(GraphQLDirectives.class)).thenReturn(true);

        builder.object = element;

        GraphQLDirective[] directivesArray = {directive1, directive2};
        AnnotatedElement annotatedElement = Arrays.stream(directivesArray)
                .map(directive -> new DirectiveJavaAnnotationUtil().createDirectiveAnnotatedElement(directive))
                .collect(Collectors.toList())
                .get(0);

        builder.object = annotatedElement;
        builder.container = container;

        List<GraphQLDirective> directives = builder.build();

        Assert.assertEquals(2, directives.size());
    }

    @Test
    public void builderThrowsExceptionWhenNoDirectivesAvailable() {
        AnnotatedElement object = Mockito.mock(AnnotatedElement.class);
        ProcessingElementsContainer container = new ProcessingElementsContainer();

        DirectivesBuilder builder = new DirectivesBuilder(object, container);

        try {
            builder.build();
            Assert.fail("Expected GraphQLAnnotationsException to be thrown");
        } catch (GraphQLAnnotationsException e) {
            String message = e.getMessage();
            Assert.assertTrue(message.contains("No directives found on the object"));
        }
    }

}