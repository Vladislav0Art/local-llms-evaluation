package graphql.annotations.processor.retrievers.fieldBuilders;

import graphql.annotations.annotationTypes.directives.activation.GraphQLDirectives;
import graphql.annotations.processor.ProcessingElementsContainer;

public class GeneratedTestBuildFieldBuildersDirectives5 {

    private ProcessingElementsContainer container;

    @Before
    public void setup() {
        AnnotatedElement object = new TestObjectAnnotation();
        container = new ProcessingElementsContainer();
        directives = new DirectivesBuilder(object, container);
    }

    @Test
    public void testBuildFieldBuildersDirectives5() {
        Assert.assertTrue(Arrays.asList(
                new GraphQLDirective[]{
                        GraphQLDirective.newBuilder(GraphQLArgument.builder().name("type").build()),
                        GraphQLDirective.newBuilder(GraphQLArgument.builder().name("value").build())
                }.containsAll(directives.build()));
    }

    public class TestObjectAnnotation {
        @GraphQLField
        public String name;

        @GraphQLField
        public Integer age;
    }

}