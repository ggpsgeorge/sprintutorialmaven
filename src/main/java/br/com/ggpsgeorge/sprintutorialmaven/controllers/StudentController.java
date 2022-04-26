package br.com.ggpsgeorge.sprintutorialmaven.controllers;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.ggpsgeorge.sprintutorialmaven.PoW.Block;
import br.com.ggpsgeorge.sprintutorialmaven.PoW.Blockchain;
import br.com.ggpsgeorge.sprintutorialmaven.PoW.ProofOfWork;
import br.com.ggpsgeorge.sprintutorialmaven.Student.Student;

@RestController
public class StudentController {
    
    @GetMapping("/student")
    public List<Student> showStudent(){
        return List.of(
                new Student(
                    1L,
                    "Kuririn", 
                    36,
                    LocalDate.of(1986,  Month.MAY, 26),
                    "idiealot@dbz.com"));
    }

    @GetMapping("/proof")
    public static ArrayList<Block> generateBlockchain()throws Exception{
        return ProofOfWork.blockchainInit().getChain();
    }
}
