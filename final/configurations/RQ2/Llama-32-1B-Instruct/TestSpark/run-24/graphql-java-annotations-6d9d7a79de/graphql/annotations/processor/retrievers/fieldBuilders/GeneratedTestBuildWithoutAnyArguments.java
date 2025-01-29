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

public class GeneratedTestBuildWithoutAnyArguments {

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
    public void testBuildWithoutAnyArguments() throws GraphQLAnnotationsException {
        DirectivesBuilder builder = createDirectivesBuilder(arguments);
        assertEquals(0, builder.build().length);
    }

}