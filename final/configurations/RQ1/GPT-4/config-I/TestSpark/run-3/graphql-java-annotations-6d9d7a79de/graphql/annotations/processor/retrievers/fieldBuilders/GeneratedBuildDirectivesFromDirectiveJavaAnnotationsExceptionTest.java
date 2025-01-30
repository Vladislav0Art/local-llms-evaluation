package graphql.annotations.processor.retrievers.fieldBuilders;

import graphql.annotations.annotationTypes.GraphQLDirectives;
import graphql.annotations.processor.exceptions.GraphQLAnnotationsException;
import graphql.annotations.processor.retrievers.fieldBuilders.DirectivesBuilder;
import graphql.annotations.processor.util.DirectiveJavaAnnotationUtil;
import graphql.annotations.processor.ProcessingElementsContainer;
import graphql.schema.GraphQLArgument;
import graphql.schema.GraphQLDirective;
import graphql.schema.GraphQLScalarType;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedBuildDirectivesFromDirectiveJavaAnnotationsExceptionTest {

    @Mock
    private ProcessingElementsContainer container;
    @Mock
    private Field object;
    @Mock
    private GraphQLDirective directive;
    @Mock
    private Annotation mockAnnotation;

    @Test
    public void buildDirectivesFromDirectiveJavaAnnotationsExceptionTest() {
        // Arrange
        DirectivesBuilder directivesBuilder = new DirectivesBuilder(object, container);
        HashMap<String, ProcessingElementsContainer.TypeAndDirective> registry = new HashMap<>();
        when(container.getDirectiveRegistry()).thenReturn(registry);

        when(DirectiveJavaAnnotationUtil.getDirectiveAnnotations(object)).thenReturn(Collections.singletonList(mockAnnotation));
        when(DirectiveJavaAnnotationUtil.getName(mockAnnotation)).thenReturn("name");

        // Act
        directivesBuilder.build();
    }

}