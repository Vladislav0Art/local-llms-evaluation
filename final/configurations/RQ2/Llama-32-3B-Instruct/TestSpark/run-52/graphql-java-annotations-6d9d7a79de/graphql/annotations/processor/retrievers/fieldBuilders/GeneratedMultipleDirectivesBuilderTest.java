package graphql.annotations.processor.retrievers.fieldBuilders;

import graphql.annotations.processor.retrievers.fieldBuilders.DirectivesBuilder;
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
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedMultipleDirectivesBuilderTest {

    @Mock
    private AnnotatedElement object;

    @Mock
    private ProcessingElementsContainer container;

    @Test
    public void multipleDirectivesBuilderTest() {
        // Given
        AnnotatedElement element = object;
        ProcessingElementsContainer elementsContainer = container;

        GraphQLDirective directive1 = newDirective("directive1");
        GraphQLDirective directive2 = newDirective("directive2");

        List<GraphQLDirective> directives = Arrays.asList(directive1, directive2);

        // When
        DirectivesBuilder builder = new DirectivesBuilder(element, elementsContainer);
        GraphQLDirective[] result = builder.build();

        // Then
        Mockito.verify(result).equals(directories);
    }

}