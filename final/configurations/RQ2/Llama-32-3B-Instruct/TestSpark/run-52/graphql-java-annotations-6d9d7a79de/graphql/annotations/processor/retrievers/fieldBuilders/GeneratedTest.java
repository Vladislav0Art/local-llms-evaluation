package graphql.annotations.processor.retrievers.fieldBuilders;

public class GeneratedTest {

    @Mock
    private AnnotatedElement element;

    public List<GraphQLDirective> getDirectivesFromAnnotatedClass() {
        return Arrays.asList(new GraphQLDirective("directive1"), new GraphQLDirective("directive2"));
    }

    @Test
    public void builderConstructorTest() {
        new DirectivesBuilder(object, container);
    }

    @Test
    public void buildMethodTest() {
        // Given
        GraphQLDirective[] directives = Mockito.mock(GraphQLDirective[].class);

        // When
        DirectivesBuilder builder = new DirectivesBuilder(object, container);
        GraphQLDirective[] result = builder.build();

        // Then
        Mockito.verify(directives).equals(result);
    }

    @Test
    public void noDirectiveAnnotationTest() {
        AnnotatedElement element = object;
        ProcessingElementsContainer elementsContainer = container;

        DirectivesBuilder builder = new DirectivesBuilder(element, elementsContainer);
        builder.build();
    }

    @Test
    public void buildMethodThrowsExceptionWhenNoDirectivesArePresentTest() {
        AnnotatedElement element = object;
        ProcessingElementsContainer elementsContainer = container;

        DirectivesBuilder builder = new DirectivesBuilder(element, elementsContainer);
        builder.build();
    }

}