package graphql.annotations.processor.retrievers.fieldBuilders;

import graphql.annotations.processor.ProcessingElementsContainer;
import graphql.annotations.processor.util.DirectiveJavaAnnotationUtil;
import graphql.schema.*;
import graphql.schema.GraphQLDirectiveContainer.Builder;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.mockito.ArgumentMatchers;
import graphql.annotations.processor.exceptions.GraphQLAnnotationsException;

import java.lang.reflect.Method;
import java.util.*;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedBuildTooMuchArgumentsErrorTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void buildTooMuchArgumentsErrorTest() throws Exception {
        AnnotatedElement object = mock(AnnotatedElement.class);
        ProcessingElementsContainer container = mock(ProcessingElementsContainer.class);

        Annotation annotation = mock(Annotation.class);
        when(DirectiveJavaAnnotationUtil.getDirectiveAnnotations(object)).thenReturn(Arrays.asList(annotation));

        Class<?> fakeClass = mock(Class.class);
        Method[] methods = new Method[]{mock(Method.class), mock(Method.class), mock(Method.class)};
        when(fakeClass.getDeclaredMethods()).thenReturn(methods);
        when(annotation.annotationType()).thenReturn(fakeClass);

        String name = "fakeName";
        when(DirectiveJavaAnnotationUtil.getName(annotation)).thenReturn(name);

        GraphQLDirective graphQLDirective = mock(GraphQLDirective.class);

        when(container.getDirectiveRegistry().containsKey(name)).thenReturn(true);

        when(container.getDirectiveRegistry().get(name).getDirective()).thenReturn(graphQLDirective);

        List<GraphQLArgument> arguments = Arrays.asList(mock(GraphQLArgument.class), mock(GraphQLArgument.class));
        when(graphQLDirective.getArguments()).thenReturn(arguments);

        DirectivesBuilder directivesBuilder = new DirectivesBuilder(object, container);

        thrown.expect(GraphQLAnnotationsException.class);
        thrown.expectMessage(String.format(DirectivesBuilder.TOO_MUCH_ARGUMENTS_ERROR, graphQLDirective.getName()));

        directivesBuilder.build();
    }

}