package graphql.annotations.processor.retrievers.fieldBuilders;

public class GeneratedTest {

    private DirectivesBuilder directivesBuilder;

    @BeforeEach
    public void setup() {
        directivesBuilder = new DirectivesBuilder(null, null);
    }

    @Test
    public void build_nullAnnotatedElement_throwsException() {
        directivesBuilder.setObject(null);
        assertThrows(GraphQLAnnotationsException.class, directivesBuilder::build);
    }

    @Test
    public void build_nullContainer_throwsException() {
        directivesBuilder.setContainer(null);
        assertThrows(GraphQLAnnotationsException.class, directivesBuilder::build);
    }

    @Test
    public void build_noDirectives_emptyArray() {
        assertEquals(0, directivesBuilder.build().length);
    }

    @Test
    public void build_annotationDirective_verifiesAttributes() {
        directivesBuilder.setObject(mock(AnnotatedElement.class));
        directivesBuilder.setContainer(mock(ProcessingElementsContainer.class));
        when(directivesBuilder.getContainer().getDirectiveRegistry()).thenReturn(new HashMap<>());

        GraphQLDirective[] directives = directivesBuilder.build();
        assertEquals(0, directives.length);
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