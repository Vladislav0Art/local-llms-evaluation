package graphql.annotations.processor.retrievers.fieldBuilders;

import graphql.annotations.annotationTypes.directives.activation.GraphQLDirectives;
import graphql.annotations.processor.ProcessingElementsContainer;
import graphql.annotations.processor.exceptions.GraphQLAnnotationsException;
import graphql.annotations.processor.retrievers.fieldBuilders.DirectivesBuilder;
import graphql.annotations.processor.util.DirectiveJavaAnnotationUtil;
import graphql.schema.GraphQLArgument;
import graphql.schema.GraphQLDirective;
import graphql.schema.GraphQLScalarType;
import graphql.schema.GraphQLType;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.Mockito;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedBuildSuccessTest {

    @Mock
    private AnnotatedElement object;
    @Mock
    private ProcessingElementsContainer container;
    @Mock
    private DirectiveJavaAnnotationUtil directiveUtil;
    @Mock
    private GraphQLDirectives[] directivesArray;

    @Test
    public void buildSuccessTest() {
        // Given
        DirectivesBuilder builder = new DirectivesBuilder(object, container);
        Mockito.when(object.getAnnotationsByType(GraphQLDirectives.class)).thenReturn(directivesArray);

        // When
        GraphQLDirective[] result = builder.build();

        // Then
        assertEquals(result, directivesArray);
    }

}