package com.rps.demo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

import com.cg.admin.AdminModuleeApplication;
import com.cg.admin.dto.AdminDTO;
import com.cg.admin.entity.Admin;
import com.cg.admin.exceptions.AdminException;
import com.cg.admin.repository.IAdminRepository;
import com.cg.admin.service.IAdminServiceImpl;
import com.fasterxml.jackson.databind.ObjectMapper;

@SpringBootTest
@ContextConfiguration(classes = AdminModuleeApplication.class)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class AdminServiceTest {

	 @Mock
	    private AdminDTO admindto;
    @Mock
    private IAdminRepository iAdminRepository;

    @InjectMocks
    private IAdminServiceImpl iAdminServiceImpl;

    ObjectMapper ob=new ObjectMapper();

    @BeforeEach
    void setUp() {
        
    }
  @Test
  @Order(1)
    void testcreateAdmin() throws AdminException {
        Admin admin = new Admin();
        admin.setAdminId(7);
        admin.setAdminPassword("Hema@1");
        admin.setAdminUsername("Yuiokjhf");
        iAdminServiceImpl.createAdmin(admindto );

}


  @Test
  @Order(2)
    void testUpdateAdmin() throws AdminException{
      Admin admin=new Admin();
      admin.setAdminId(7);
      admin.setAdminPassword("Hema@1234");
      admin.setAdminUsername("Yuiokjhf");
      iAdminServiceImpl.updateAdmin(admin);
  }
  @Order(5)
  @Test
  void testdeleteAdmin() throws AdminException {
      Admin admin=new Admin();
      admin.setAdminId(7);
      admin.setAdminPassword("Hema@1234");
      admin.setAdminUsername("Yuiokjhf");
      iAdminRepository.deleteById(6);

  }
  @Test
  @Order(3)
  void testviewAdmin() throws AdminException {
      Admin admin=new Admin();
      admin.setAdminId(7);
      admin.setAdminPassword("Hema@1234");
      admin.setAdminUsername("Yuiokjhf");
      iAdminRepository.findById(7);
}
  @Order(4)
  @Test
  void testviewAllAdmin() throws AdminException {
      Admin admin=new Admin();
      admin.setAdminId(7);
      admin.setAdminPassword("Hema@1234");
      admin.setAdminUsername("Yuiokjhf");
      iAdminRepository.findAll();
}
}

