package graphql.annotations.processor.retrievers.fieldBuilders;

public class GeneratedBuild_graphQLDirectivesAnnotation_verifiesAttributes {

    private DirectivesBuilder directivesBuilder;

    @BeforeEach
    public void setup() {
        directivesBuilder = new DirectivesBuilder(null, null);
    }

    @Test
    public void build_graphQLDirectivesAnnotation_verifiesAttributes() {
        directivesBuilder.setObject(mock(AnnotatedElement.class));
        directivesBuilder.setContainer(mock(ProcessingElementsContainer.class));
        when(directivesBuilder.getContainer().getDirectiveRegistry()).thenReturn(new HashMap<>());

        GraphQLDirective[] directives = directivesBuilder.build();
        assertEquals(0, directives.length);
    }

}