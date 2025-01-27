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

public class GeneratedBuild_Negative_ThrowsGraphQLAnnotationsException {

    @Test
    public void build_Negative_ThrowsGraphQLAnnotationsException() {
        AnnotatedElement object = Mockito.mock(AnnotatedElement.class);
        object.isAnnotationPresent(GraphQLDirectives.class);
        ProcessingElementsContainer container = Mockito.mock(ProcessingElementsContainer.class);
        doThrow(GraphQLAnnotationsException.class).when(container).process(any());
        DirectivesBuilder builder = new DirectivesBuilder(object, container);
        assertThrows(GraphQLAnnotationsException.class, () -> builder.build());
    }

}