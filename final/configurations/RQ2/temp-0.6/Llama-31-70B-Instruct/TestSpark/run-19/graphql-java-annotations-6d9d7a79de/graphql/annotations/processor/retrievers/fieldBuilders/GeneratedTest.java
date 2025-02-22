package graphql.annotations.processor.retrievers.fieldBuilders;

public class GeneratedTest {

    @Test
    public void testBuildFromJavaAnnotations() {
        // setup
        AnnotatedElement mockAnnotatedElement = mock(AnnotatedElement.class);
        ProcessingElementsContainer mockContainer = mock(ProcessingElementsContainer.class);
        GraphQLDirective mockDirective = mock(GraphQLDirective.class);
        when(mockContainer.getDirectiveRegistry()).thenReturn(new HashMap<String, GraphQLDirective>() {
            {
                put("testDirective", mockDirective);
            }
        }

    }