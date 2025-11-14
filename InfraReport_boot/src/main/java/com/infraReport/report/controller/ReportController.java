package com.infraReport.report.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.infraReport.report.service.ReportService;

@Controller
public class ReportController {
	
	@Autowired
	ReportService reportService;
	
	/*
	 * 시작 페이지
	 * */
    @GetMapping("/")
    public String dailyReport() {
        return "report/dailyReport.tiles";
    }
    
    /*
	 * 메인 페이지
	 * */
    @GetMapping("/report")
    public String mainReport(Model model) {
    	model.addAttribute("currentDate", new Date());
        return "report/mainReport.tiles";
    }
    
    /*
     * 엑셀 내보내기
     * */
    @PostMapping("/report/exportExcel")
    @ResponseBody
    public void exportExcel(@RequestParam HashMap<String, Object> requestMap, HttpServletResponse response) throws Exception {
        reportService.exportExcel(requestMap, response);
    }

    /*
     * 엑셀 업로드
     * */
    @PostMapping("/report/uploadExcel")
    @ResponseBody
    public Map<String, Object> uploadExcel(@RequestParam("uploadType") String uploadType, @RequestParam("excelFile") MultipartFile file) {
        return reportService.uploadExcel(uploadType, file);
    }
    
}
