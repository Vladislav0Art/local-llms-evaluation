package graphql.annotations.processor.retrievers.fieldBuilders;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import graphql.annotations.processor.ProcessingElementsContainer;
import graphql.schema.GraphQLArgument;
import graphql.schema.GraphQLDirective;
import graphql.schema.GraphQLScalarType;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.util.Collections;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTransformArgsAnnotationWithScalarTypeTest {

    @Mock
    private AnnotatedElement object;

    @Mock
    private ProcessingElementsContainer container;

    @Test
    public void transformArgsAnnotationWithScalarTypeTest() throws NoSuchMethodException {
        Directive directive = new Directive("foo", new GraphQLArgument[]{}, false);
        Annotation annotation = Mockito.mock(Annotation.class);
        Method method = getClass().getDeclaredMethod("testMethod");
        when(annotation.getClass().getDeclaredMethods()).thenReturn(new Method[]{method});
        when(directive.getArguments()).thenReturn(Collections.singletonList(new GraphQLArgument("arg", null, new GraphQLScalarType(null, null, null, null, null, null, null), null)));
        DirectivesBuilder directivesBuilder = new DirectivesBuilder(object, container);
        directivesBuilder.transformArgs(directive, annotation);
    }

    // a dummy method to mimic an annotation method
    public void testMethod() {
    }

}