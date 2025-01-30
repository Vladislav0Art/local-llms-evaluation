package graphql.annotations.processor.retrievers.fieldBuilders;

import graphql.annotations.annotationTypes.directives.activation.GraphQLDirectives;
import graphql.annotations.processor.ProcessingElementsContainer;
import graphql.annotations.processor.retrievers.fieldBuilders.DirectivesBuilder;
import graphql.annotations.processor.util.DirectiveJavaAnnotationUtil;
import graphql.schema.GraphQLArgument;
import graphql.schema.GraphQLDirective;
import graphql.schema.GraphQLScalarType;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTransformArgsParseExceptionTest {

    @Test
    public void transformArgsParseExceptionTest() throws NoSuchMethodException {
        Method method = String.class.getMethod("length");
        Annotation annotation = mock(Annotation.class);
        Annotation annotatedElement = mock(Annotation.class);
        ProcessingElementsContainer container = mock(ProcessingElementsContainer.class);
        DirectivesBuilder directivesBuilder = new DirectivesBuilder(annotatedElement, container);

        when(annotatedElement.getAnnotation(GraphQLDirectives.class)).thenReturn(null);
        when(annotation.annotationType().getDeclaredMethods()).thenReturn(new Method[]{method});
        when(container.getDirectiveRegistry().containsKey(any())).thenReturn(true);

        GraphQLDirective directive = mock(GraphQLDirective.class);
        GraphQLArgument argument = mock(GraphQLArgument.class);
        List<GraphQLArgument> list = new ArrayList<>();
        list.add(argument);

        when(directive.getArguments()).thenReturn(list);
        when(container.getDirectiveRegistry().get(any())).thenReturn(directive);

        GraphQLScalarType scalarType = mock(GraphQLScalarType.class);
        when(argument.getType()).thenReturn(scalarType);
        when(scalarType.getCoercing().parseValue(any())).thenThrow(new Exception());

        DirectiveJavaAnnotationUtil.getDirectiveAnnotations(annotatedElement).add(annotation);

        try {
            directivesBuilder.build();
            fail("Expected exception to be thrown");
        } catch (Exception e) {
            assertEquals(DirectivesBuilder.COULD_NOT_PARSE_ARGUMENT_VALUE_TO_ARGUMENT_TYPE, e.getMessage());
        }
    }

}