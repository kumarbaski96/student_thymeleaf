package com.student.ms.studenController;

import com.student.ms.studentModel.StudentEntity;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class StudentController {
    @GetMapping("/")
    public String getIndexPage(){
        return "index";
    }
    @GetMapping("/home")
    public String getHomePage(Model model){
        StudentEntity studentEntity =new StudentEntity();
        studentEntity.setName("Baski Kumar");
        studentEntity.setMobile("7488162756");
        model.addAttribute("mystud",studentEntity);
        return "home";
    }
    @GetMapping("/contact")
    public String getContactPage(Model model){
        model.addAttribute("EID",1002);
        return "contact";
    }
    @ResponseBody
    @GetMapping("/emp/{eid}")
    public String emp(@PathVariable("eid") int eid){
     return "Your emp id is : "+eid;
    }

}
