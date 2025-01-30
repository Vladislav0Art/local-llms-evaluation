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
public class GeneratedTransformArgsWrongArgumentTypeTest {

    @Test
    public void transformArgsWrongArgumentTypeTest() throws NoSuchMethodException {
        Field field = String.class.getField("length");
        Annotation annotation = mock(Annotation.class);
        Annotation annotatedElement = mock(Annotation.class);
        ProcessingElementsContainer container = mock(ProcessingElementsContainer.class);
        DirectivesBuilder directivesBuilder = new DirectivesBuilder(annotatedElement, container);

        when(annotatedElement.getAnnotation(GraphQLDirectives.class)).thenReturn(null);
        when(annotation.annotationType().getDeclaredMethods()).thenReturn(new Method[]{});
        when(container.getDirectiveRegistry().containsKey(any())).thenReturn(true);

        GraphQLArgument argument = mock(GraphQLArgument.class);
        List<GraphQLArgument> list = new ArrayList<>();
        list.add(argument);

        when(argument.getType()).thenReturn(field);
        when(directive.getArguments()).thenReturn(list);
        when(container.getDirectiveRegistry().get(any())).thenReturn(directive);

        DirectiveJavaAnnotationUtil.getDirectiveAnnotations(annotatedElement).add(annotation);

        try {
            directivesBuilder.build();
            fail("Expected exception to be thrown");
        } catch (Exception e) {
            assertEquals(DirectivesBuilder.DIRECTIVE_ARGUMENT_TYPE_MUST_BE_A_SCALAR, e.getMessage());
        }
    }

}