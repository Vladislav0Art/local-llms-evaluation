package graphql.annotations.processor.retrievers.fieldBuilders;

import graphql.annotations.processor.util.DirectiveJavaAnnotationUtil;
import graphql.schema.GraphQLDirective;
import graphql.schema.GraphQLType;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Mock
    AnnotatedElement object;
    @Mock
    ProcessingElementsContainer container;

    private DirectivesBuilder directivesBuilder;

    @Before
    public void setup() {
        directivesBuilder = new DirectivesBuilder(object, container);
    }

    @Test
    public void build_whenObjectIsNull_shouldThrowException() {
        AnnotatedElement nullObject = null;
        directivesBuilder = new DirectivesBuilder(nullObject, container);
        assertThrows(NullPointerException.class, directivesBuilder::build);
    }

    @Test
    public void build_whenContainerIsNull_shouldThrowException() {
        ProcessingElementsContainer nullContainer = null;
        directivesBuilder = new DirectivesBuilder(object, nullContainer);
        assertThrows(NullPointerException.class, directivesBuilder::build);
    }

}