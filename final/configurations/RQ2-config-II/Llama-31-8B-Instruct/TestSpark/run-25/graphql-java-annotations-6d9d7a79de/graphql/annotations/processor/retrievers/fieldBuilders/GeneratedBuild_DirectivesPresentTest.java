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
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedBuild_DirectivesPresentTest {

    @Mock
    private ProcessingElementsContainer container;

    @InjectMocks
    private DirectivesBuilder underTest;

    @Test
    public void build_DirectivesPresentTest() {
        // Arrange
        AnnotatedElement object = new Object() {
            @Override
            public Class<?> getAnnotation(Class<? extends Annotation> annotationClass) {
                return GraphQLDirectives.class;
            }
        };

        when(container.getDirectiveJavaAnnotationUtil()).thenReturn(new DirectiveJavaAnnotationUtil() {
            @Override
            public List<GraphQLDirective> getDirectives(AnnotatedElement element) {
                return Arrays.asList(newDirective("directive1").build(), newDirective("directive2").build());
            }
        });

        // Act
        GraphQLDirective[] result = underTest.build();

        // Assert
        assertEquals(2, result.length);
    }

}