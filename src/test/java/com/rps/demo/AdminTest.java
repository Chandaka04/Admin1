package com.rps.demo;

 

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

 

import java.util.Set;

 

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

 

import org.junit.jupiter.api.Test;

import com.cg.admin.entity.Admin;

 





 

class AdminTest {

 

   /* @Test
    void testAdminConstructor() {
        int id = 1;
        String adminUserName = "Hema";
        String adminPassword = "Hema@123";
        Admin admin= new Admin(1, "Hema", "Hema@123");

 

        assertEquals(id, category.getId());
        assertEquals(categoryName, category.getCategoryName());
    }

 

    @Test
    void testGettersAndSetters() {
        int id = 1;
        String categoryName = "Music";
        Category category = new Category();

 

        category.setId(id);
        category.setCategoryName(categoryName);

 

        assertEquals(id, category.getId());
        assertEquals(categoryName, category.getCategoryName());
    }
*/
 

    @Test
    void testToString() {
        Admin admin = new Admin(1, "admin123", "Password@123");

        String expectedString = "Admin [adminId=1, adminUsername=admin123, adminPassword=Password@123]";
        String actual = admin.toString();

        assertEquals(expectedString, admin.toString());
    }
    @Test
    void testAdminUserNameNotNullAndNotBlank() {
        Admin admin = new Admin();
        admin.setAdminId(1);

        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        Validator validator = factory.getValidator();
        Set<ConstraintViolation<Admin>> violations = validator.validate(admin);

        assertTrue(violations.stream().anyMatch(v -> v.getMessage().equals("Username Cannot be Empty")));
        assertTrue(violations.stream().anyMatch(v -> v.getMessage().equals("Username cannot be blank")));
    }

    @Test
    void testAdminPasswordNotNullAndNotBlank() {
        Admin admin = new Admin();
        admin.setAdminId(1);

        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        Validator validator = factory.getValidator();
        Set<ConstraintViolation<Admin>> violations = validator.validate(admin);

        assertTrue(violations.stream().anyMatch(v -> v.getMessage().equals("Password Cannot be Empty")));
        assertTrue(violations.stream().anyMatch(v -> v.getMessage().equals("Password cannot be blank")));
    }
    @Test
    void testAdminIdReturnValue() {
        Admin admin = new Admin();
        admin.setAdminId(1);

        int result = admin.getAdminId();

        assertEquals(1, result);
    }
    @Test
    void testAdminPasswordReturnValue() {
        Admin admin = new Admin();
        admin.setAdminPassword("password123");

        String result = admin.getAdminPassword();

        assertEquals("password123", result);
    }

   
}

   /* @Test
    void testCategoryNameNotNull() {
        Category category = new Category();
        category.setId(1);

 

        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        Validator validator = factory.getValidator();
        Set<ConstraintViolation<Category>> violations = validator.validate(category);

 

        assertTrue(violations.stream().anyMatch(v -> v.getMessage().equals("Category name cannot be null!")));
    }

 

    @Test
    void testCategoryNameNotBlank() {
        Category category = new Category();
        category.setId(1);
        category.setCategoryName("");

 

        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        Validator validator = factory.getValidator();
        Set<ConstraintViolation<Category>> violations = validator.validate(category);

 

        assertTrue(violations.stream().anyMatch(v -> v.getMessage().equals("Category name connot be blank!")));
    }

    @Test
    void testCategoryDtoConstructor() {
        int id = 1;
        String categoryName = "Music";
        CategoryDto categoryDto = new CategoryDto(id, categoryName);

 

        assertEquals(id, categoryDto.getId());
        assertEquals(categoryName, categoryDto.getCategoryName());
    }

 

    @Test
    void testGettersAndSetters1() {
        int id = 1;
        String categoryName = "Music";
        CategoryDto categoryDto = new CategoryDto();

 

        categoryDto.setId(id);
        categoryDto.setCategoryName(categoryName);

 

        assertEquals(id, categoryDto.getId());
        assertEquals(categoryName, categoryDto.getCategoryName());
    }
}

 */