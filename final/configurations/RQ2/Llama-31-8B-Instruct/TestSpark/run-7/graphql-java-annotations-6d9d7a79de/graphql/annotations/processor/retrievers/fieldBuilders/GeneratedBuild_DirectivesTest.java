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
public class GeneratedBuild_DirectivesTest {

    @Mock
    private ProcessingElementsContainer container;

    @Mock
    private AnnotatedElement annotatedElement;

    @InjectMocks
    private DirectivesBuilder directivesBuilder;

    @Test
    public void build_DirectivesTest() {
        // Arrange
        GraphQLDirective directive1 = new GraphQLDirective("directive1", "description1", true, null, new ArrayList<>(), null);
        GraphQLDirective directive2 = new GraphQLDirective("directive2", "description2", true, null, new ArrayList<>(), null);
        when(annotatedElement.getAnnotations()).thenReturn(new Annotation[]{new Object() {
            @Override
            public Class<? extends Annotation> annotationType() {
                return GraphQLDirectives.class;
            }
        }(){
        private final GraphQLDirective[] directives = new GraphQLDirective[]{directive1, directive2};

        @Override
        public GraphQLDirective[] value () {
            return directives;
        }
		}});

        // Act
        GraphQLDirective[] result = directivesBuilder.build();

        // Assert
        assertArrayEquals(new GraphQLDirective[]{directive1, directive2}, result);
    }

}