package com.student.ms.studentRepository;

import com.student.ms.studentModel.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepsitory extends JpaRepository<StudentEntity, Integer> {

}
