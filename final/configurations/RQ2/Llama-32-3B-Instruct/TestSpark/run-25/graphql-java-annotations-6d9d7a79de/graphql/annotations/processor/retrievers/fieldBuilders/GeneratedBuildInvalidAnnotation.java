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
import java.util.stream.Collectors;

import org.junit.Test;

import static graphql.schema.GraphQLDirective.newDirective;

import org.mockito.Mock;
import org.mockito.Mockito;

public class GeneratedBuildInvalidAnnotation {

    @Mock
    private AnnotatedElement object;

    @Mock
    private ProcessingElementsContainer container;

    @Test
    public void buildInvalidAnnotation() {
        // Arrange
        object.annotationType().getName();
        Mockito.when(object instanceof DirectivesBuilder).thenReturn(this.object);
        Mockito.when(container.getProcessingElements()).thenReturn(new ArrayList<>());

        // Act
        DirectivesBuilder builder = new DirectivesBuilder(object, container);
        builder.build();
    }

}