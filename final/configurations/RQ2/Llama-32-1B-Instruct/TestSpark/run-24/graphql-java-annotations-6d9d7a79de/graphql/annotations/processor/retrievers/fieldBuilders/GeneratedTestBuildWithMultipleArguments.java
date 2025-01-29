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

public class GeneratedTestBuildWithMultipleArguments {

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
    public void testBuildWithMultipleArguments() throws GraphQLAnnotationsException {
        Object[] arguments = new Object[]{arguments[0]};
        for (int i = 0; i < 3; i++) {
            Object[] nestedArguments = new Object[]{arguments[0]};
            nestedArguments[i] = i;
            DirectivesBuilder builder = createDirectivesBuilder(arguments);
            assertEquals(4, builder.build().length);
            DirectiveJavaAnnotationUtil.assertNoDirectives(builder.build()[0], arguments[0]);
        }
    }

}