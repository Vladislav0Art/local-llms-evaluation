package graphql.annotations.processor.retrievers.fieldBuilders;

public class GeneratedBuilderBuildsDirectivesForObjectWithSingleDirective {

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

}