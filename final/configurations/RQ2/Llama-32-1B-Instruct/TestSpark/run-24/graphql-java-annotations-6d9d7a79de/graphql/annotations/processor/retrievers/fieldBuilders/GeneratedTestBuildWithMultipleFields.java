package graphql.annotations.processor.retrievers.fieldBuilders;

import graphql.annotations.annotationTypes.directives.activation.GraphQLDirectives;
import graphql.annotations.processor.ProcessingElementsContainer;
import graphql.annotations.processor.exceptions.GraphQLAnnotationsException;
import graphql.annotations.processor.util.DirectiveJavaAnnotationUtil;
import graphql.schema.GraphQLArgument;
import graphql.schema.GraphQLDirective;
import graphql.schema.GraphQLScalarType;
import graphql.schema.GraphQLType;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Method;

public class GeneratedTestBuildWithMultipleFields {

    private Object[] arguments;
    private ProcessingElementsContainer container;

    @Before
    public void setup() {
        arguments = new Object[]{new GraphQLDirective[0]};
        container = new ProcessingElementsContainer();
    }

    public DirectivesBuilder createDirectivesBuilder(Object[] arguments) {
        return new DirectivesBuilder(object, container);
    }

    @Test
    public void testBuildWithMultipleFields() throws GraphQLAnnotationsException {
        Object[] arguments = new Object[]{arguments[0]};
        List<GraphQLArgument> fieldDefinitions = Arrays.asList(
                mock(GraphQLArgument.class),
                mock(GraphQLArgument.class)
        );
        DirectivesBuilder builder = createDirectivesBuilder(arguments, fieldDefinitions);
        assertEquals(3, builder.build().length);
        DirectiveJavaAnnotationUtil.assertNoDirectives(builder.build()[0], arguments[0]);
    }

}

class MockObject {
    public GraphQLDirective getDirective() {
        return null;
    }
}

class MockProcessingElementsContainer {
    @Override
    public List<GraphQLArgument> getElements() {
        return Arrays.asList(
                mock(GraphQLArgument.class)
        );
    }

    @Override
    public DirectiveJavaAnnotationUtil createDirectiveJavaAnnotation(AnnotatedElement element) {
        return null;
    }
}

class MockDirectorive {
    public GraphQLDirective build(Object object) {
        return new GraphQLDirective();
    }

}