package com.kavya.stuDetails.repo;

import com.kavya.stuDetails.model.Student;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface StudentRepo extends JpaRepository <Student,Integer>{

}