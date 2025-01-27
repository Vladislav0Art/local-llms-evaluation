package graphql.annotations.processor.retrievers.fieldBuilders;

public class GeneratedBuildEmptyDirectivesSuccessTest {

    @Test
    public void buildEmptyDirectivesSuccessTest() {
        AnnotatedElement object = Mockito.mock(AnnotatedElement.class);
        ProcessingElementsContainer container = Mockito.mock(ProcessingElementsContainer.class);
        GraphQLDirective[] result = DirectivesBuilder.newDirectivesBuilder(object, container).build();
        Assert.assertArrayEquals(new GraphQLDirective[]{}, result);
    }

}