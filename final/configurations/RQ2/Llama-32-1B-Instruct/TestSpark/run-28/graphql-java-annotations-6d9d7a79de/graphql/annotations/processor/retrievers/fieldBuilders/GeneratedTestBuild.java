package graphql.annotations.processor.retrievers.fieldBuilders;

import graphql.annotations.annotationTypes.directives.activation.GraphQLDirectives;
import graphql.annotations.processor.ProcessingElementsContainer;

public class GeneratedTestBuild {

    private ProcessingElementsContainer container;

    @Before
    public void setup() {
        AnnotatedElement object = new TestObjectAnnotation();
        container = new ProcessingElementsContainer();
        directives = new DirectivesBuilder(object, container);
    }

    @Test
    public void testBuild() {
        Assert.assertTrue(Arrays.asList(
                GraphQLDirective.newBuilder(GraphQLArgument.builder().name("type").build()),
                GraphQLDirective.newBuilder(GraphQLArgument.builder().name("value").build())
        ).containsAll(directives.build()));
    }

}