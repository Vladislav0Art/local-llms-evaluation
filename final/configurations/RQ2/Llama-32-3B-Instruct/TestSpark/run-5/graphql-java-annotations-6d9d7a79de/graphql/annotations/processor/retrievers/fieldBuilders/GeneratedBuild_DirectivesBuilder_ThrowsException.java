package graphql.annotations.processor.retrievers.fieldBuilders;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.lang.reflect.Method;

import graphql.annotations.annotationTypes.directives.activation.GraphQLDirectives;
import graphql.annotations.processor.ProcessingElementsContainer;
import graphql.annotations.processor.retrievers.fieldBuilders.DirectivesBuilder;
import graphql.annotations.processor.exceptions.GraphQLAnnotationsException;
import graphql.annotations.processor.util.DirectiveJavaAnnotationUtil;
import graphql.schema.GraphQLArgument;
import graphql.schema.GraphQLDirective;
import graphql.schema.GraphQLScalarType;
import graphql.schema.GraphQLType;

public class GeneratedBuild_DirectivesBuilder_ThrowsException {

    @Test
    public void build_DirectivesBuilder_ThrowsException() {
        AnnotatedElement object = Mockito.mock(AnnotatedElement.class);
        ProcessingElementsContainer container = new ProcessingElementsContainer();
        DirectivesBuilder builder = new DirectivesBuilder(object, container);

        GraphQLAnnotationsException exception = new GraphQLAnnotationsException("Test Exception");
        try {
            builder.build(exception);
            fail("Expected GraphQLAnnotationsException");
        } catch (GraphQLAnnotationsException e) {
            assertEquals(exception.getMessage(), e.getMessage());
        }
    }

}