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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedDirectivesBuilder_Constructor_ThrowsGraphQLAnnotationsException_withInvalidArgs {

    @Test
    public void DirectivesBuilder_Constructor_ThrowsGraphQLAnnotationsException_withInvalidArgs() {
        AnnotatedElement object = null;
        ProcessingElementsContainer container = mock(ProcessingElementsContainer.class);

        try {
            new DirectivesBuilder(object, container);
            fail("Expected exception not thrown");
        } catch (GraphQLAnnotationsException e) {
            assertNotNull(e.getMessage());
        }
    }

}