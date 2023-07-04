//package com.rps.demo;
//
//
//	import org.junit.jupiter.api.Test;
//	import org.mockito.InjectMocks;
//	import org.mockito.Mock;
//	import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.ContextConfiguration;
//
//import com.cg.admin.entity.Admin;
//import com.cg.admin.exceptions.AdminException;
//import com.cg.admin.repository.IAdminRepository;
//import com.cg.admin.service.IAdminServiceImpl;
//
//import static org.junit.jupiter.api.Assertions.*;
//	import static org.mockito.Mockito.*;
//
//import java.util.Collections;
//import java.util.Optional;
//	@SpringBootTest
//	@ContextConfiguration(classes = AdminServiceImplTest.class)
//	 class AdminServiceImplTest {
//
//	    @Mock
//	    private IAdminRepository iAdminRepository;
//
//	    @InjectMocks
//	    private IAdminServiceImpl iadminService;
//
//	    @Test
//	    void testUpdateAdmin_Success() throws AdminException {
//	        // Prepare test data
//	        Admin admin = new Admin();
//	        admin.setAdminId(1);
//	        admin.setAdminUsername("admin");
//	        admin.setAdminPassword("password123");
//
//	        // Mock the repository method
//	        when(iAdminRepository.save(admin)).thenReturn(admin);
//
//	        // Call the service method
//	        Admin updatedAdmin = iadminService.updateAdmin(admin);
//
//	        // Assert the updated admin
//	        assertNotNull(updatedAdmin);
//	        assertEquals(admin, updatedAdmin);
//
//	        // Verify the repository method was called
//	        verify(iAdminRepository, times(1)).save(admin);
//	    }
//
//	    @Test
//	    void testDeleteAdmin_Success() throws AdminException {
//	        // Prepare test data
//	        int adminId = 1;
//	        Admin admin = new Admin();
//	        admin.setAdminId(adminId);
//	        admin.setAdminUsername("admin");
//	        admin.setAdminPassword("password123");
//
//	        // Mock the repository method
//	        when(iAdminRepository.findById(adminId)).thenReturn(Optional.of(admin));
//
//	        // Call the service method
//	        Admin deletedAdmin = iadminService.deleteAdmin(adminId);
//
//	        // Assert the deleted admin
//	        assertNotNull(deletedAdmin);
//	        assertEquals(admin, deletedAdmin);
//
//	        // Verify the repository method was called
//	        verify(iAdminRepository, times(1)).findById(adminId);
//	        verify(iAdminRepository, times(1)).deleteById(adminId);
//	    }
//	    @Test
//	    void testViewAllAdmin_NoAdminFound_ThrowsException() {
//	        // Mock the repository method to return an empty list
//	        when(iAdminRepository.findAll()).thenReturn(Collections.emptyList());
//
//	        // Call the service method and assert that it throws the expected exception
//	        AdminException exception = assertThrows(AdminException.class, () -> iadminService.viewAllAdmin());
//
//	        // Assert the exception message
//	        assertEquals("Sorry! No admin found!!", exception.getMessage());
//
//	        // Verify the repository method was called
//	        verify(iAdminRepository, times(1)).findAll();
//	    }
//	    @Test
//	    void testCreateAdmin_AdminNotRegistered_ReturnsSavedAdmin() throws AdminException {
//	        // Prepare test data
//	        Admin admin = new Admin();
//	        admin.setAdminUsername("admin123");
//	        admin.setAdminPassword("password123");
//
//	        // Mock the repository method
//	        when(iAdminRepository.findByAdminUsername(admin.getAdminUsername())).thenReturn(null);
//	        when(iAdminRepository.save(admin)).thenReturn(admin);
//
//	        // Call the service method
//	        Admin savedAdmin = iadminService.createAdmin(admin);
//
//	        // Assert the saved admin
//	        assertNotNull(savedAdmin);
//	        assertEquals(admin, savedAdmin);
//
//	        // Verify the repository methods were called
//	        verify(iAdminRepository, times(1)).findByAdminUsername(admin.getAdminUsername());
//	        verify(iAdminRepository, times(1)).save(admin);
//	    }
//
//	    
//
//	}
//
//
//
