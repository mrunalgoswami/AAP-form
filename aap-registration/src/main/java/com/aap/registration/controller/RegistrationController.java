
package com.aap.registration.controller;

import com.aap.registration.model.Member;
import com.aap.registration.service.ExcelExporter;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class RegistrationController {
    private final List<Member> members = new ArrayList<>();

    @PostMapping("/register")
    public ResponseEntity<String> register(@RequestBody Member member) throws IOException {
        members.add(member);
        ExcelExporter.exportToExcel(members);
        return ResponseEntity.ok("Saved");
    }
}
