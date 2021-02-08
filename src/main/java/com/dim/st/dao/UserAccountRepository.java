package com.dim.st.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dim.st.entities.UserAccount;

public interface UserAccountRepository extends JpaRepository<UserAccount, Integer>{

}
