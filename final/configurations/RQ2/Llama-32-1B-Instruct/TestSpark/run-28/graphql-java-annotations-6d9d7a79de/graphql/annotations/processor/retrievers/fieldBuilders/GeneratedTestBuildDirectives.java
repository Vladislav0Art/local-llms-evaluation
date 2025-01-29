package graphql.annotations.processor.retrievers.fieldBuilders;

import graphql.annotations.annotationTypes.directives.activation.GraphQLDirectives;
import graphql.annotations.processor.ProcessingElementsContainer;

public class GeneratedTestBuildDirectives {

    private ProcessingElementsContainer container;

    @Before
    public void setup() {
        AnnotatedElement object = new TestObjectAnnotation();
        container = new ProcessingElementsContainer();
        directives = new DirectivesBuilder(object, container);
    }

    @Test
    public void testBuildDirectives() {
        Assert.assertTrue(Arrays.asList(
                new GraphQLDirective[]{
                        GraphQLDirective.newBuilder(GraphQLDirectives.DIRECTIVE_NAME),
                        GraphQLDirective.newBuilder(GraphQLDirectives.DIRECTIVE_VALUE)
                }.containsAll(directives.buildDirectives()))
        ).containsAll(directives.buildFieldBuildersDirectives()));
    }

}