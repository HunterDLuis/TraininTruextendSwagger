package com.example.demo.web;

import com.example.demo.domain.Teacher;
import com.example.demo.service.TeacherService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/teacher")
@Api(value="onlinestore", description="Operations pertaining to teachers in Online Store")
public class TeacherController {
    private final org.slf4j.Logger logger = LoggerFactory.getLogger(TeacherController.class);

    @Autowired
    TeacherService  teacherService;

    @ApiOperation(value = "Search a teacher with an ID",response = Teacher.class)
    @RequestMapping(method = RequestMethod.GET)
    public List<Teacher> getTeacher(){
        return teacherService.getAllTeachers();
    }

    @ApiOperation(value = "Search a teachers with an ID",response = Teacher.class)
    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
    public List<Teacher> getTeacherById(@PathVariable long id){

        logger.info("the value of teacher is" + id);
        return teacherService.getAllTeachers();
    }

    @RequestMapping(method = RequestMethod.PATCH)
    public ResponseEntity update(@RequestBody Teacher teacher){
        logger.info("test----->" + teacher.getId());
        System.out.println("the values i");
        return  new ResponseEntity(HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity create(@RequestBody Teacher teacher){
        logger.info("test----->" + teacher.getId());
        System.out.println("the values i");
        return  new ResponseEntity(HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.DELETE)
    public ResponseEntity deleteTeacher(@RequestBody Teacher teacher){
        logger.info("test----->" + teacher.getId());
        System.out.println("the values i");
        return  new ResponseEntity(HttpStatus.NO_CONTENT);
    }
}

