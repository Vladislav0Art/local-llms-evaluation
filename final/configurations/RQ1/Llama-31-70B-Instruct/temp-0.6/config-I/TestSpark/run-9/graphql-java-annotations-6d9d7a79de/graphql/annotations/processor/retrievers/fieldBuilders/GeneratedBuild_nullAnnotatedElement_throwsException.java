package graphql.annotations.processor.retrievers.fieldBuilders;

public class GeneratedBuild_nullAnnotatedElement_throwsException {

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

}