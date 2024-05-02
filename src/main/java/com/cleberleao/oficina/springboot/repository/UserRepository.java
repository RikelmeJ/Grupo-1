<<<<<<< HEAD
package com.cleberleao.oficina.springboot.repository;

import com.cleberleao.oficina.springboot.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}
=======
package com.cleberleao.oficina.springboot.repository;

import com.cleberleao.oficina.springboot.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}
>>>>>>> cff7010b1dbc3e4592a0bcc478f4966bba2fcc0f
