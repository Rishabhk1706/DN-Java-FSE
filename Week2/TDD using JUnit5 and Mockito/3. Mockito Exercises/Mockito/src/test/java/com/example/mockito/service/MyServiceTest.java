package com.example.mockito.service;

import com.example.mockito.api.ExternalApi;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class MyServiceTest {

    @Test
    void testFetchData() {

        // Create Mock
        ExternalApi mockApi = mock(ExternalApi.class);

        // Stub Method
        when(mockApi.getData()).thenReturn("Mock Data");

        // Inject Mock
        MyService service = new MyService(mockApi);

        // Call Method
        String result = service.fetchData();

        // Assertion
        assertEquals("Mock Data", result);

    }

    @Test
    void testVerifyInteraction() {

        ExternalApi mockApi = mock(ExternalApi.class);

        MyService service = new MyService(mockApi);

        service.fetchData();

        verify(mockApi).getData();
    }
}