package graphql.annotations.processor.retrievers.fieldBuilders;

import graphql.annotations.annotationTypes.directives.activation.GraphQLDirectives;
import graphql.annotations.processor.ProcessingElementsContainer;

public class GeneratedTest {

    private ProcessingElementsContainer container;

    @Before
    public void setup() {
        AnnotatedElement[] objects = new AnnotatedElement[2];
        objects[0] = new TestObjectAnnotation();
        objects[1] = new TestFieldAnnotation();

        container = new ProcessingElementsContainer();
        directives = new DirectivesBuilder(objects, container);
    }

}