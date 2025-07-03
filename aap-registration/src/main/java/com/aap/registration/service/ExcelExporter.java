
package com.aap.registration.service;

import com.aap.registration.model.Member;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

public class ExcelExporter {
    public static void exportToExcel(List<Member> members) throws IOException {
        Workbook workbook = new XSSFWorkbook();
        Sheet sheet = workbook.createSheet("Members");

        Row header = sheet.createRow(0);
        String[] headers = {"ID", "Constituency", "Booth", "Name", "Address", "Taluka", "WhatsApp", "EPIC", "DOB", "FormFiller", "Signature"};
        for (int i = 0; i < headers.length; i++) {
            header.createCell(i).setCellValue(headers[i]);
        }

        int rowIdx = 1;
        for (Member m : members) {
            Row row = sheet.createRow(rowIdx++);
            row.createCell(0).setCellValue(m.getId());
            row.createCell(1).setCellValue(m.getAssemblyConstituency());
            row.createCell(2).setCellValue(m.getBoothNumber());
            row.createCell(3).setCellValue(m.getName());
            row.createCell(4).setCellValue(m.getAddress());
            row.createCell(5).setCellValue(m.getTalukaWard());
            row.createCell(6).setCellValue(m.getWhatsapp());
            row.createCell(7).setCellValue(m.getEpicId());
            row.createCell(8).setCellValue(String.valueOf(m.getDob()));
            row.createCell(9).setCellValue(m.getFormFiller());
            row.createCell(10).setCellValue(m.getSignature());
        }

        try (FileOutputStream out = new FileOutputStream("MemberData.xlsx")) {
            workbook.write(out);
        }
        workbook.close();
    }
}
