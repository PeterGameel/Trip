package com.example.assignment.Service;

import com.example.assignment.model.Admin;
import com.example.assignment.repo.adminRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AdminService {

private final adminRepo adminrepo;
    @Autowired
    public AdminService(adminRepo adminrepo) {
        this.adminrepo = adminrepo;
    }

    public void addAdmin(Admin admin){ //REGISTER

        adminrepo.save(admin);
    }
    public List<Admin> listOfAdmins() {
        return adminrepo.findAll();

    }
    public String updateAdmin(Admin admin,long ID)
    {
        Optional<Admin> admin1=adminrepo.findById(ID);
        admin1.get().setUserName(admin.getUserName());
        admin1.get().setFullName(admin.getFullName());
        admin1.get().setAdminPassword(admin.getAdminPassword());
        admin1.get().setEmailOfAdmin(admin.getEmailOfAdmin());
        adminrepo.save(admin1.get());
        return "Admin Updated";
    }
    public String RemoveAdmin (long ID){
        adminrepo.deleteById(ID);
        return "Admin is removed";
    }

}
