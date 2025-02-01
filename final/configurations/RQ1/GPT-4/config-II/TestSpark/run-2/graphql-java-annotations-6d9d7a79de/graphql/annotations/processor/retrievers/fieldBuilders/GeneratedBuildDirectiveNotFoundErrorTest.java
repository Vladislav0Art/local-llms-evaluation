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

public class GeneratedBuildDirectiveNotFoundErrorTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void buildDirectiveNotFoundErrorTest() {
        AnnotatedElement object = mock(AnnotatedElement.class);
        ProcessingElementsContainer container = mock(ProcessingElementsContainer.class);

        Annotation annotation = mock(Annotation.class);
        when(DirectiveJavaAnnotationUtil.getDirectiveAnnotations(object)).thenReturn(Collections.singletonList(annotation));

        String name = "fakeName";
        when(DirectiveJavaAnnotationUtil.getName(annotation)).thenReturn(name);

        when(container.getDirectiveRegistry().containsKey(name)).thenReturn(false);

        DirectivesBuilder directivesBuilder = new DirectivesBuilder(object, container);
        thrown.expect(GraphQLAnnotationsException.class);
        thrown.expectMessage(String.format(DirectivesBuilder.NOT_FOUND_IN_DIRECTIVE_REGISTRY_ERROR, name));
        directivesBuilder.build();
    }

}