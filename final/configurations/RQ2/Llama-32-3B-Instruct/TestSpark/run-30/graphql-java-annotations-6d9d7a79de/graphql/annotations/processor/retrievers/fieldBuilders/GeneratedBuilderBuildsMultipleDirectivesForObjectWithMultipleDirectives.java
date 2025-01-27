package graphql.annotations.processor.retrievers.fieldBuilders;

public class GeneratedBuilderBuildsMultipleDirectivesForObjectWithMultipleDirectives {

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

}