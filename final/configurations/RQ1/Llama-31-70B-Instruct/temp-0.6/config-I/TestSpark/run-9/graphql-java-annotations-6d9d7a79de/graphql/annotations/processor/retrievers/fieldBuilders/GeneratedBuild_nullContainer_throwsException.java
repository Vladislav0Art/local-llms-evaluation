package graphql.annotations.processor.retrievers.fieldBuilders;

public class GeneratedBuild_nullContainer_throwsException {

    private DirectivesBuilder directivesBuilder;

    @BeforeEach
    public void setup() {
        directivesBuilder = new DirectivesBuilder(null, null);
    }

    @Test
    public void build_nullContainer_throwsException() {
        directivesBuilder.setContainer(null);
        assertThrows(GraphQLAnnotationsException.class, directivesBuilder::build);
    }

}