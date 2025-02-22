package graphql.annotations.processor.retrievers.fieldBuilders;

public class GeneratedBuild_noDirectives_emptyArray {

    private DirectivesBuilder directivesBuilder;

    @BeforeEach
    public void setup() {
        directivesBuilder = new DirectivesBuilder(null, null);
    }

    @Test
    public void build_noDirectives_emptyArray() {
        assertEquals(0, directivesBuilder.build().length);
    }

}