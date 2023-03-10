package com.weblab.magnetism.service.impl;

import com.weblab.magnetism.model.Role;
import com.weblab.magnetism.repository.RoleRepository;
import com.weblab.magnetism.service.interf.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServiceImpl extends AbstractCRUDService<Role, Long> implements RoleService {

    private final RoleRepository roleRepository;

    public RoleServiceImpl(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }


    @Override
    CrudRepository<Role, Long> getRepository() {
        return roleRepository;
    }

}
