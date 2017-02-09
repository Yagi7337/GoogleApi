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
	
	@RequestMapping(value = "/show", method = RequestMethod.GET)
	public void showFiles() throws IOException {
			googleDriveService.showFiles();
	}
	
	@RequestMapping(value = "/create", method = RequestMethod.POST)
	public void createGoogleDocFile() throws IOException {
			googleDriveService.createGoogleDocFile();
	}
	
	@RequestMapping(value = "/delete", method = RequestMethod.DELETE)
	public void deleteFile() throws IOException {
			googleDriveService.deleteFile();
	}

}
