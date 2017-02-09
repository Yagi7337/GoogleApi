package com.api.google.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.api.google.service.GoogleDriveService;

@RestController
@RequestMapping("/google_drive")
public class GoogleDriveController {

	@Autowired
	GoogleDriveService googleDriveService;
	
	@RequestMapping(value = "/file_10", method = RequestMethod.DELETE)
	public void StartApp() throws IOException {
			googleDriveService.StartApp();
	}
}
