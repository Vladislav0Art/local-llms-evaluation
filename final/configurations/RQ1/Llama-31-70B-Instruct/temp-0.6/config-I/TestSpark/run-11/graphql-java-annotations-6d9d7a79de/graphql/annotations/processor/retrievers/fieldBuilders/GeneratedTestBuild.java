package graphql.annotations.processor.retrievers.fieldBuilders;

public class GeneratedTestBuild {

    @Test
    public void testBuild() {
        DirectivesBuilder directivesBuilder = new DirectivesBuilder(new Object(), new ProcessingElementsContainer());
        GraphQLDirective[] result = directivesBuilder.build();
        assertEquals(0, result.length);
    }

}