package com.rps.demo;

 

import static org.junit.jupiter.api.Assertions.assertEquals;

 

import org.junit.jupiter.api.Test;

import com.cg.admin.exceptions.AdminException;

 



 

class RecordNotFoundExceptionTest {

 

    @Test
    void testDefaultConstructor() {
        AdminException exception = new AdminException();

 

        assertEquals(null, exception.getMessage());
    }

 

    @Test
    void testParameterizedConstructor() {
        String errorMessage = "Record not found";
       AdminException exception = new AdminException(errorMessage);

 

        assertEquals(errorMessage, exception.getMessage());
    }
}